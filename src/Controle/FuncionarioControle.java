package Controle;

import Modelos.Funcionario;
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

public class FuncionarioControle implements Controles      
{
    private ArrayList<Funcionario> lista;

    public FuncionarioControle(){
        this.lista = new ArrayList<>();
        this.inicializa();
    }

    public ArrayList<Funcionario> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Funcionario> funcionarios) {
        this.lista = funcionarios;
    }
    
    //Ler os dados do arquivo
    @Override
    public void inicializa()
    {
        try 
        {
            FileReader arq = new FileReader(CAMINHO + "Funcionario.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha;
            try 
            {
                linha = lerArq.readLine();
                while(linha!=null){
                    this.lista.add(new Funcionario(linha));
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
                FileWriter arq = new FileWriter( CAMINHO + "Funcionario.txt");
                PrintWriter gravarArq = new PrintWriter(arq);
                try
                {
                    for(Funcionario funcionario : this.lista)
                    {
                        gravarArq.println("" + funcionario.getNome() + '|' + funcionario.getSalario() + '|' + funcionario.getCpf() + '|' + funcionario.getTelefone() + '|' + funcionario.getEndereco().formatado() + '|');
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
    
    public boolean validaCpf(String cpf)
    {
        for(Funcionario funcionario : this.getLista())
        {
            if(cpf.equals(funcionario.getCpf().trim()))
            {
                JOptionPane.showMessageDialog(null, "O cpf já existe", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }           
        }
        return true;
    }
    
    @Override
    public void cadastra(Object funcionario)
    {
        try 
        {
            this.getLista().add((Funcionario) funcionario);
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
        Funcionario funcionario = this.getLista().get(i);
        if(funcionario != null)
        {
            if(JOptionPane.showConfirmDialog(null, "Tem Certeza") == 0)
            {
                JOptionPane.showMessageDialog(null, "Não Desligue o compuador");
                this.getLista().remove(funcionario);
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
        ArrayList<Funcionario> achados = new ArrayList<>();
        
        if(s != null && !s.equals(""))
        {
            switch(opc)
            {
                case 1:
                    for(Funcionario funcionario : this.lista)
                    {                        
                        if(funcionario.getNome().trim().equalsIgnoreCase(s) || funcionario.getNome().trim().equals(s) || funcionario.getNome().trim().contains(s) || funcionario.getNome().trim().toLowerCase().contains(s.toLowerCase()))
                        {
                            achados.add(funcionario);
                        }
                    }
                break;
                
                case 2:
                    for(Funcionario funcionario : this.lista)
                    {
                        if(funcionario.getCpf().trim().equals(s) || funcionario.getCpf().trim().contains(s))
                        {
                            achados.add(funcionario);
                        }
                    }
                break;

                case 3:
                    for(Funcionario funcionario : this.lista)
                    {
                        if(funcionario.getTelefone().trim().equals(s) || funcionario.getTelefone().trim().contains(s))
                        {
                            achados.add(funcionario);
                        }
                    }                    
                break;
            }    
            if(!achados.isEmpty()){
                this.lista.removeAll(achados);
                for(Funcionario achado : achados)
                {
                    this.lista.add(0, achado);
                }
                this.grava();
            }
        }
    }
    
    public String retornaNome(String cpf)
    {
        if(cpf.equals(""))
        {
            return "Anonimo";
        }
        for(Funcionario funcionario : this.lista)
        {
            if(funcionario.getCpf().trim().equals(cpf))
            {
                return funcionario.getNome();                
            }
        }
        return "Não encontrado";
    }
}
