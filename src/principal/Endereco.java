package principal;

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
    private int numero;

    // Criando os construtores da classe
    public Endereco() { }

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) 
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

    public int getNumero() 
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

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    // Retornando todos os dados através do método toString
    @Override
    public String toString() {
        return "Endereço: Rua " + rua + ", Numero " + numero + ", Bairro " + bairro + ", Cidade " + cidade + ", Estado " + estado;
    }
}
