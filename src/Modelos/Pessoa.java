package Modelos;

import Controle.Valida;
import javax.swing.JOptionPane;

/**
 *
 * @author genilton
 */

// Classe abstrata Pessoa
public abstract class Pessoa 
{
    
    // Criando os atributos
    protected String nome;
    protected String cpf; 
    protected String telefone;
    protected Endereco endereco;
    
    // Criando os construtores da classe
    public Pessoa() { }

    public Pessoa(String nome, String cpf, String telefone, Endereco endereco)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    // métodos Get/Set
    public String getNome() 
    {
        return nome;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public String getTelefone() 
    {
        return telefone;
    }

    public Endereco getEndereco() 
    {
        return this.endereco;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }

    public void setEndereco(Endereco endereco)
    {
        this.endereco = endereco;
    }

    // Retornando todos os dados através do método toString
    @Override
    public String toString() 
    {
        return nome + ", CPF: " + cpf + ", telefone: " + telefone + " " + endereco.toString();
    }
    
    public boolean validaCpf(String cpf)
    {
        if (Valida.temLetra(cpf))
        {
            JOptionPane.showMessageDialog(null, "O cpf não pode conter letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if(!cpf.isEmpty())
            {
                this.setCpf(cpf);
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "O cpf não pode ser vazio", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
    
    public boolean validaNome(String nome)
    {
        if(nome.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "O nome não pode ser vazio", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else 
        {
            if(nome.contains("|"))
            {
                JOptionPane.showMessageDialog(null, "O nome não pode ter caracteres especiais", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else 
            {
                this.setNome(nome);
                return true;
            }
        }
    }
    
    public boolean validaTelefone(String telefone)
    {
        if (Valida.temLetra(telefone))
        {
            JOptionPane.showMessageDialog(null, "O telefone não pode conter letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if(telefone.isEmpty())
            {
                JOptionPane.showMessageDialog(null, "O telefone não pode ser vazio", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {             
                this.setTelefone(telefone);
                return true;
            }
        }
    }
}
