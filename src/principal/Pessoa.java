package principal;

/**
 *
 * @author genilton
 */

public abstract class Pessoa 
{
    protected String nome;
    protected String cpf; 
    protected String telefone;
    protected Endereco endereco;    
    
    public Pessoa() { }

    public Pessoa(String nome, String cpf, String telefone, Endereco endereco) 
    {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

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
        return endereco;
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

    @Override
    public String toString() 
    {
        return nome + ", CPF: " + cpf + ", telefone: " + telefone + this.endereco.toString();
    }
}
