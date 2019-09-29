package Controle;

import Modelos.Cliente;
import Modelos.Estoque;
import Modelos.Produto;
import Intefarce.Controles;
import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static Intefarce.Controles.CAMINHO;

/**
 *
 * @author genilton
 */

public class EstoqueControle implements Controles
{
    private ArrayList<Estoque> lista;

    public EstoqueControle(){
        this.lista = new ArrayList<>();
        this.inicializa();
    }

    public ArrayList<Estoque> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estoque> estoques) {
        this.lista = estoques;
    }
    
    //Ler os dados do arquivo
    @Override
    public void inicializa()
    {
        try 
        {
            FileReader arq = new FileReader(CAMINHO + "Estoque.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha;
            try 
            {
                linha = lerArq.readLine();
                while(linha!=null){
                    this.lista.add(new Estoque(linha));
                    linha = lerArq.readLine();
                }
                arq.close();
            } 
            catch (IOException ex) 
            {
                JOptionPane.showMessageDialog(null, "Erro: Não foi possível ler o arquivo!", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } 
        catch (FileNotFoundException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro: Arquivo não encontrado!", "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
        catch (HeadlessException ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro Headless: " + ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception ex) 
        {
            JOptionPane.showMessageDialog(null, "Erro Me derrubaram aqui OH: " + ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        if(!this.lista.isEmpty())
        {
            Produto.setCount(this.lista.get(this.lista.size()-1).getProduto().getCodigo()+1);
        }
    }
    
    //Metodo que Grava No arquivo
    @Override
    public void grava()
    {
        if(!this.lista.isEmpty()){
            try
            {                
                FileWriter arq = new FileWriter( CAMINHO + "Estoque.txt");
                PrintWriter gravarArq = new PrintWriter(arq);
                try
                {
                    for(Estoque estoque : this.lista)
                    {
                        gravarArq.println("" + estoque.getProduto().formatado() + '|' + estoque.getQtdEstoque() + '|');
                    }
                }
                finally
                {
                    gravarArq.close();
                    arq.close();
                }
            } 
            catch (IOException e) 
            {
                JOptionPane.showMessageDialog(null, "Erro ao gravar: \n" + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    @Override
    public void apaga(int i) {
        Estoque estoque = this.getLista().get(i);
        if(estoque != null)
        {
            if(JOptionPane.showConfirmDialog(null, "Tem Certeza") == 0)
            {
                JOptionPane.showMessageDialog(null, "Não Desligue o compuador");
                this.getLista().remove(estoque);
                try 
                {
                    this.grava();
                } 
                catch (Exception e) 
                {                
                    JOptionPane.showMessageDialog(null, "Perdeu Tudo Playboy: " + e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
                }                                
            }            
        }
    }

    @Override
    public void busca(int opc, String s) {
        ArrayList<Estoque> achados = new ArrayList<>();
        
        if(s != null && !s.equals(""))
        {
            switch(opc)
            {
                case 1:
                    for(Estoque estoque : this.lista)
                    {                        
                        if(estoque.getProduto().getNome().trim().equalsIgnoreCase(s) || estoque.getProduto().getNome().trim().equals(s) || estoque.getProduto().getNome().trim().contains(s) || estoque.getProduto().getNome().trim().toLowerCase().contains(s.toLowerCase()))
                        {
                            achados.add(estoque);
                        }
                    }
                break;
                
                case 2:
                    for(Estoque estoque : this.lista)
                    {
                        if(estoque.getProduto().getPreco() == Valida.converteDouble(s))
                        {
                            achados.add(estoque);
                        }
                    }
                break;

                case 3:
                    for(Estoque estoque : this.lista)
                    {
                        if(estoque.getQtdEstoque() == Valida.converteInt(s))
                        {
                            achados.add(estoque);
                        }
                    }                    
                break;
            }    
            if(!achados.isEmpty()){
                this.lista.removeAll(achados);
                for(Estoque achado : achados)
                {
                    this.lista.add(0, achado);
                }
                this.grava();
            }
        }
    }

    @Override
    public void cadastra(Object estoque) {
        try 
        {
            this.getLista().add((Estoque) estoque);
            this.grava();
            JOptionPane.showMessageDialog(null, "Realizado Com Sucesso", "Menssagem", JOptionPane.INFORMATION_MESSAGE);
        }  
        catch (HeadlessException e) 
        {
            JOptionPane.showMessageDialog(null, "Erro Headless " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch (Exception e) 
        {        
            JOptionPane.showMessageDialog(null, "Erro qualquer " + e, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public double retornaPreco(int codigo)
    {
        for(Estoque estoque : this.lista)
        {
            if(estoque.getProduto().getCodigo() == codigo)
            {
                return estoque.getProduto().getPreco();
            }
        }
        return 0;
    }

}
