package Controle;

import Modelos.Manutencao;
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

public class ManutencaoControle implements Controles
{
    ArrayList<Manutencao> lista;

    public ManutencaoControle() 
    {
        lista = new ArrayList<>();
        this.inicializa();
    }
    
    public ArrayList<Manutencao> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Manutencao> manutencaos) {
        this.lista = manutencaos;
    }  

    @Override
    public void inicializa()
    {
        try 
        {
            FileReader arq = new FileReader(CAMINHO + "Manutencao.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha;
            try
            {
                linha = lerArq.readLine();
                while(linha!=null){
                    this.lista.add(new Manutencao(linha));
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
                FileWriter arq = new FileWriter( CAMINHO + "Manutencao.txt");
                PrintWriter gravarArq = new PrintWriter(arq);
                try
                {
                    for(Manutencao manutencao : this.lista)
                    {
                        gravarArq.println("" + manutencao.getCpfCliente() + '|' + manutencao.getData().formatado() + '|' + manutencao.isPago() + '|' + manutencao.getPreco()+ '|'+ manutencao.getDesc() + '|');
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
    public void cadastra(Object manutencao)
    {
        try
        {
            this.getLista().add((Manutencao) manutencao);
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
        Manutencao manutencao = this.getLista().get(i);
        if(manutencao != null)
        {
            if(JOptionPane.showConfirmDialog(null, "Tem Certeza") == 0)
            {
                JOptionPane.showMessageDialog(null, "Não Desligue o compuador");
                this.getLista().remove(manutencao);
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
        ArrayList<Manutencao> achados = new ArrayList<>();
        
        if(s != null && !s.equals(""))
        {
            switch(opc)
            {
                case 1:
                    for(Manutencao manutencao : this.lista)
                    {                       
                        if(manutencao.getCpfCliente().trim().equalsIgnoreCase(s) || manutencao.getCpfCliente().trim().equals(s) || manutencao.getCpfCliente().trim().contains(s) || manutencao.getCpfCliente().trim().toLowerCase().contains(s.toLowerCase()))
                        {
                            achados.add(manutencao);
                        }
                    }
                break;
                
                case 2:
                    for(Manutencao manutencao : this.lista)
                    {
                        if(manutencao.isPago() == Valida.converteBoolean(s.trim()))
                        {
                            achados.add(manutencao);
                        }
                    }
                break;

                case 3:
                    for(Manutencao manutencao : this.lista)
                    {
                        if(manutencao.getData().toString().trim().equals(s) || manutencao.getData().toString().trim().contains(s))
                        {
                            achados.add(manutencao);
                        }
                    }                    
                break;
            }    
            if(!achados.isEmpty()){
                this.lista.removeAll(achados);
                for(Manutencao achado : achados)
                {
                    this.lista.add(0, achado);
                }
                this.grava();
            }
        }
    }
    
    public void imprime(int i)
    {
        Manutencao manutencao = this.lista.get(i);
        if(manutencao != null){        
            try
            {              
                String path = "src//Notas//" + manutencao.getCpfCliente().trim();
                FileWriter arq = new FileWriter(path, true);
                PrintWriter gravarArq = new PrintWriter(arq);
                try
                {
                    gravarArq.println("Nome: " + new ClienteControle().retornaNome(manutencao.getCpfCliente().trim()));
                    gravarArq.println("CPF: " + manutencao.getCpfCliente());
                    gravarArq.println("Data: " + manutencao.getData().toString());
                    gravarArq.println("Foi pago: " + ((manutencao.isPago())? "Sim" : "Não"));
                    gravarArq.println("Serviço de manutenção: " + manutencao.getDesc().trim());
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
