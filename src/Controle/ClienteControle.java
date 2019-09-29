package Controle;

import Modelos.Cliente;
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

public class ClienteControle implements Controles      
{
    private ArrayList<Cliente> lista;

    public ClienteControle(){
        this.lista = new ArrayList<>();
        this.inicializa();
    }

    public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cliente> clientes) {
        this.lista = clientes;
    }
    
    //Ler os dados do arquivo
    @Override
    public void inicializa()
    {
        try 
        {
            FileReader arq = new FileReader(CAMINHO + "Cliente.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha;
            try 
            {
                linha = lerArq.readLine();
                while(linha!=null){
                    this.lista.add(new Cliente(linha));
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
                FileWriter arq = new FileWriter( CAMINHO + "Cliente.txt");
                PrintWriter gravarArq = new PrintWriter(arq);
                try
                {
                    for(Cliente cliente : this.lista)
                    {
                        gravarArq.println("" + cliente.getNome() + '|' + cliente.getCpf() + '|' + cliente.getTelefone() + '|' + cliente.getEndereco().formatado() + '|');
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
        for(Cliente cliente : this.getLista())
        {
            if(cpf.equals(cliente.getCpf().trim()))
            {
                JOptionPane.showMessageDialog(null, "O cpf já existe", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }           
        }
        return true;
    }
    
    @Override
    public void cadastra(Object cliente)
    {
        try 
        {
            this.getLista().add((Cliente) cliente);
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
        Cliente cliente = this.getLista().get(i);
        if(cliente != null)
        {
            if(JOptionPane.showConfirmDialog(null, "Tem Certeza") == 0)
            {
                JOptionPane.showMessageDialog(null, "Não Desligue o compuador");
                this.getLista().remove(cliente);
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
        ArrayList<Cliente> achados = new ArrayList<>();
        
        if(s != null && !s.equals(""))
        {
            switch(opc)
            {
                case 1:
                    for(Cliente cliente : this.lista)
                    {                        
                        if(cliente.getNome().trim().equalsIgnoreCase(s) || cliente.getNome().trim().equals(s) || cliente.getNome().trim().contains(s) || cliente.getNome().trim().toLowerCase().contains(s.toLowerCase()))
                        {
                            achados.add(cliente);
                        }
                    }
                break;
                
                case 2:
                    for(Cliente cliente : this.lista)
                    {
                        if(cliente.getCpf().trim().equals(s) || cliente.getCpf().trim().contains(s))
                        {
                            achados.add(cliente);
                        }
                    }
                break;

                case 3:
                    for(Cliente cliente : this.lista)
                    {
                        if(cliente.getTelefone().trim().equals(s) || cliente.getTelefone().trim().contains(s))
                        {
                            achados.add(cliente);
                        }
                    }                    
                break;
            }    
            if(!achados.isEmpty()){
                this.lista.removeAll(achados);
                for(Cliente achado : achados)
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
        for(Cliente cliente : this.lista)
        {
            if(cliente.getCpf().trim().equals(cpf))
            {
                return cliente.getNome().trim();                
            }
        }
        return "Não encontrado";
    }
}
