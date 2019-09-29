package Modelos;

import Controle.Valida;
import javax.swing.JOptionPane;

/**
 *
 * @author genilton
 */

public class Endereco 
{
    // Criando os atributos
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String numero;

    // Criando os construtores da classe
    public Endereco() { }
    
    public Endereco(String rua, String numero, String bairro, String cidade, String estado) 
    {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
    }

    // Métodos Get/Set

    
    public String getRua() 
    {
        return rua;
    }

    public String getBairro() 
    {
        return bairro;
    }

    public String getCidade() 
    {
        return cidade;
    }

    public String getEstado() 
    {
        return estado;
    }

    public String getNumero() 
    {
        return numero;
    }

    public void setRua(String rua) 
    {
        this.rua = rua;
    }

    public void setBairro(String bairro) 
    {
        this.bairro = bairro;
    }

    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }

    public void setEstado(String estado) 
    {
        this.estado = estado;
    }

    public void setNumero(String numero) 
    {
        this.numero = numero;
    }

    // Retornando todos os dados através do método toString
    @Override
    public String toString() {
        return "" + this.getRua() + ", " + this.getNumero() + ", " + this.getBairro() + ", " + this.getCidade() + ", " + this.getEstado();
    }

    public String formatado() {
        return "" + this.getRua() + '|' + this.getNumero() + '|' + this.getBairro() + '|' + this.getCidade() + '|' + this.getEstado();
    }
    
    public boolean validaNumero(String numero)
    {
        if (Valida.temLetra(numero))
        {
            JOptionPane.showMessageDialog(null, "O numero de residencia não pode conter letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if(!numero.isEmpty())
            {
                this.setNumero(numero);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "O numero de residencia não pode ser vazio", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
    
    public boolean validaRua(String rua)
    {
        if(rua.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "O nome da rua não pode ser vazio", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else 
        {
            if(rua.contains("|"))
            {
                JOptionPane.showMessageDialog(null, "O nome da rua não pode ter caracteres especiais", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else 
            {
                this.setRua(rua);
                return true;
            }
        }
    }
    
    public boolean validaBairro(String bairro)
    {
        if(bairro.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "O nome do bairro não pode ser vazio", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else 
        {
            if(bairro.contains("|"))
            {
                JOptionPane.showMessageDialog(null, "O nome do bairro não pode ter caracteres especiais", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else 
            {
                this.setBairro(bairro);
                return true;
            }
        }
    }
    
    public boolean validaCidade(String cidade)
    {
        if(cidade.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "O nome da cidade não pode ser vazio", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else 
        {
            if(cidade.contains("|"))
            {
                JOptionPane.showMessageDialog(null, "O nome da cidade não pode ter caracteres especiais", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else 
            {
                this.setCidade(cidade);
                return true;
            }
        }
    }
    
    public boolean validaEstado(String estado)
    {
        if(estado.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "O nome do estado não pode ser vazio", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else 
        {
            if(estado.contains("|"))
            {
                JOptionPane.showMessageDialog(null, "O nome do estado não pode ter caracteres especiais", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else 
            {
                this.setEstado(estado);
                return true;
            }
        }
    }
}
