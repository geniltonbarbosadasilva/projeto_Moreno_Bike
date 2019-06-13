package principal;

import java.util.Arrays;

/**
 *
 * @author genilton
 */

public class Venda implements Servico
{
    private String notaFiscal;
    private Produto []produto;

    public Venda() { }
    
    public Venda(String notaFiscal, Produto[] produto) 
    {
        this.notaFiscal = notaFiscal;
        this.produto = produto;
    }

    public String getNotaFiscal() 
    {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) 
    {
        this.notaFiscal = notaFiscal;
    }

    public Produto[] getProduto() 
    {
        return produto;
    }

    public void setProduto(Produto[] produto) 
    {
        this.produto = produto;
    }

    @Override
    public String toString() 
    {
        return "Venda: " + " Nota Fiscal: " + notaFiscal + ", Produtos" + Arrays.toString(produto);
    }
    
    @Override
    public double calculaPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
