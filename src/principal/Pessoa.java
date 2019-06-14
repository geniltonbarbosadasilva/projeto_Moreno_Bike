package principal;

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

    // Retornando todos os dados através do método toString
    @Override
    public String toString() 
    {
        return nome + ", CPF: " + cpf + ", telefone: " + telefone + this.endereco.toString();
    }
}
