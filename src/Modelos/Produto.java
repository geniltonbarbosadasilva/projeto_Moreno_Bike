package Modelos;

import Controle.Valida;
import javax.swing.JOptionPane;

/**
 *
 * @author genilton
 */

public class Produto 
{
    // Criando os atributos
    private int codigo;
    private static int count;
    private String nome;
    private double preco;
    private int qtd;

    // Criando os Construtores da classe
    public Produto() 
    {
        this.codigo = count;
        Produto.incrementaCount();
    }
       
    // Métodos Get/Set
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtd() 
    {
        return qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public double getPreco() 
    {
        return preco;
    }
    
    public void setPreco(double preco) 
    {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int id) {
        this.codigo = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Produto.count = count;
    }

    public static void incrementaCount() 
    {
        Produto.count++; 
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
    
    public boolean validaPreco(String preco)
    {
        if (!Valida.isDouble(preco))
        {
            JOptionPane.showMessageDialog(null, "Formato de preco invalido, use apenas numeros, e ponto para separar as casas decimais", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if(!preco.isEmpty())
            {
                this.setPreco(Valida.converteDouble(preco));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Preecha um preço", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
    
    public boolean validaQtd(String qtd)
    {
        if (Valida.temLetra(qtd))
        {
            JOptionPane.showMessageDialog(null, "A quantidade não pode conter letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if(!qtd.isEmpty())
            {
                this.setQtd(Valida.converteInt(qtd));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Preecha uma quantidade", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
    
    public String formatado()
    {
        return "" + this.getCodigo() + '|' + this.getNome() + '|' + this.getPreco() + "|" + this.getQtd();
    }

    @Override
    public String toString() {
        return nome + ", preco: " + preco + ", qtd: " + qtd;
    }       
}