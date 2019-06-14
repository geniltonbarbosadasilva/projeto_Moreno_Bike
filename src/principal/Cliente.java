package principal;

/**
 *
 * @author genilton
 */

// // Classe Cliente herdando da Classe Pessoa
public class Cliente extends Pessoa
{
    // Criando os atributos
   private Servico sevico;

   // Criando os construtores da classe
    public Cliente() { }

    public Cliente(String nome, String cpf, String telefone, Endereco endereco, Servico sevico) 
    {
        super(nome, cpf, telefone, endereco);
        this.sevico = sevico;
    }

    // Métodos Get/Set
    public Servico getSevico() 
    {
        return sevico;
    }

    public void setSevico(Servico sevico) 
    {
        this.sevico = sevico;
    }

    // Retornando todos os dados através do método toString
    @Override
    public String toString() {
        return super.toString() + sevico.toString();
    }
}
