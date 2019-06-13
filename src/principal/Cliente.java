package principal;

/**
 *
 * @author genilton
 */

public class Cliente extends Pessoa
{
   private Servico sevico;

    public Cliente() { }

    public Cliente(String nome, String cpf, String telefone, Endereco endereco, Servico sevico) 
    {
        super(nome, cpf, telefone, endereco);
        this.sevico = sevico;
    }

    public Servico getSevico() 
    {
        return sevico;
    }

    public void setSevico(Servico sevico) 
    {
        this.sevico = sevico;
    }

    @Override
    public String toString() {
        return super.toString() + sevico.toString();
    }
}
