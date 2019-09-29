package Modelos;

import Controle.Valida;
import javax.swing.JOptionPane;

/**
 *
 * @author genilton
 */

public class Estoque implements Comparable
{
    // Criando os atributos
    private int qtdEstoque;
    private Produto produto;

    // Criando os Construtores da classe
    public Estoque() 
    {
        produto = new Produto();
    }
    
    public Estoque(String s)
    {  
        produto = new Produto();
        char [] letras = s.toCharArray();
        s = "";
        for(int i = 0, j = 0; i < letras.length; i++)
        {
            if(letras[i]=='|')
            {
                switch(j)
                {
                    case 0:
                        this.produto.setCodigo( (Valida.converteInt(s)) );
                    break;
                    case 1:
                        this.produto.setNome(s + '\0');
                    break;
                    case 2:
                        this.produto.setPreco(Valida.converteDouble(s));                        
                    break;
                    case 3:
                        this.produto.setQtd(Valida.converteInt(s));
                        
                    break;
                    case 4:
                        this.qtdEstoque = (Valida.converteInt(s));
                    break;
                }
                j++;
                s = "";
                continue;
            }
            s = s + letras[i];
        }      
    }

    // Métodos Get/Set
    public int getQtdEstoque() 
    {
        return this.qtdEstoque;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public void setQtdEstoque(int qtdEstoque) 
    {
        this.qtdEstoque = qtdEstoque;
    }
    
    public boolean validaQtdEstoque(String qtd)
    {
        if (Valida.temLetra(qtd))
        {
            JOptionPane.showMessageDialog(null, "A quantidade não pode conter letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if(!qtd.isEmpty())
            {
                this.setQtdEstoque(Valida.converteInt(qtd));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Preecha uma quantidade", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }

    @Override
    public int compareTo(Object o) {
        Estoque e = (Estoque) o;
        return this.produto.getCodigo() - e.getProduto().getCodigo();
    }
}
