package principal;

/**
 *
 * @author genilton
 */

public class Produto 
{
    private static int qtdEstoque;
    private String nome;
    private double preco;

    public Produto() { }

    public Produto(String nome, double preco) 
    {
        this.nome = nome;
        this.preco = preco;
    }

    public static int getQtdEstoque() 
    {
        return qtdEstoque;
    }

    public static void setQtdEstoque(int qtdEstoque) 
    {
        Produto.qtdEstoque = qtdEstoque;
    }

    public String getNome() 
    {
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

    @Override
    public String toString() 
    {
        return "Produto: " + nome + ", Preço: " + preco;
    }    
}

