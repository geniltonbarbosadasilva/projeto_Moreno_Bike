package Controle;

import Modelos.Venda;
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

/**
 *
 * @author genilton
 */

public class VendaControle implements Controles
{
    ArrayList<Venda> lista;

    public VendaControle() 
    {
        lista = new ArrayList<>();
        this.inicializa();
    }
    
    public ArrayList<Venda> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Venda> vendas) {
        this.lista = vendas;
    }  

    @Override
    public void inicializa()
    {
        try 
        {
            FileReader arq = new FileReader(CAMINHO + "Venda.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha;
            try
            {
                linha = lerArq.readLine();
                while(linha!=null){
                    this.lista.add(new Venda(linha));
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
            JOptionPane.showMessageDialog(null, "Erro: " + ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Metodo que Grava No arquivo
    @Override
    public void grava()
    {
        if(!this.lista.isEmpty()){
            try
            {                                  
                FileWriter arq = new FileWriter( CAMINHO + "Venda.txt");
                PrintWriter gravarArq = new PrintWriter(arq);
                try
                {
                    for(Venda venda : this.lista)
                    {
                        gravarArq.println("" + venda.getCpfCliente() + '|' + venda.getData().formatado() + '|' + venda.isPago() + '|' + venda.getProdutos().formatado() + '|');
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
    public void cadastra(Object venda)
    {
        try
        {
            this.getLista().add((Venda) venda);
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
    
    @Override
    public void apaga(int i)
    {
        Venda venda = this.getLista().get(i);
        if(venda != null)
        {
            if(JOptionPane.showConfirmDialog(null, "Tem Certeza") == 0)
            {
                JOptionPane.showMessageDialog(null, "Não Desligue o compuador");
                this.getLista().remove(venda);
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
    public void busca(int opc, String s)
    {
        ArrayList<Venda> achados = new ArrayList<>();
        
        if(s != null && !s.equals(""))
        {
            switch(opc)
            {
                case 1:
                    for(Venda venda : this.lista)
                    {                       
                        if(venda.getCpfCliente().trim().equalsIgnoreCase(s) || venda.getCpfCliente().trim().equals(s) || venda.getCpfCliente().trim().contains(s) || venda.getCpfCliente().trim().toLowerCase().contains(s.toLowerCase()))
                        {
                            achados.add(venda);
                        }
                    }
                break;
                
                case 2:
                    for(Venda venda : this.lista)
                    {
                        if(venda.isPago() == Valida.converteBoolean(s.trim()))
                        {
                            achados.add(venda);
                        }
                    }
                break;

                case 3:
                    for(Venda venda : this.lista)
                    {
                        if(venda.getData().toString().trim().equals(s) || venda.getData().toString().trim().contains(s))
                        {
                            achados.add(venda);
                        }
                    }                    
                break;
            }    
            if(!achados.isEmpty()){
                this.lista.removeAll(achados);
                for(Venda achado : achados)
                {
                    this.lista.add(0, achado);
                }
                this.grava();
            }
        }
    }
    
    public void imprime(int i)
    {
        Venda venda = this.lista.get(i);
        if(venda != null){        
            try
            {              
                String path = "src//Notas//" + venda.getCpfCliente().trim();
                FileWriter arq = new FileWriter(path, true);
                PrintWriter gravarArq = new PrintWriter(arq);
                try
                {
                    gravarArq.println("Nome: " + new ClienteControle().retornaNome(venda.getCpfCliente().trim()));
                    gravarArq.println("CPF: " + venda.getCpfCliente());
                    gravarArq.println("Data: " + venda.getData().toString());
                    gravarArq.println("Foi pago: " + ((venda.isPago())? "Sim" : "Não"));
                    gravarArq.println("Produto: " + venda.getProdutos().toString());
                    gravarArq.println("\n\n\n");
                    JOptionPane.showMessageDialog(null, "Sua nota esta na pasta notas");
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
}
