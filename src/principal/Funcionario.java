package principal;

/**
 *
 * @author genilton
 */

// Classe abstrata Funcionario herdando da Classe Pessoa
public abstract class Funcionario extends Pessoa
{
    // Criando os atributos
    protected Horario horarioServico;
    protected boolean ponto;

    // Criando os construtores da classe
    public Funcionario() { }

    public Funcionario(String nome, String cpf, String telefone, Endereco endereco, Horario horarioServico, boolean ponto) 
    {
        super(nome, cpf, telefone, endereco);
        this.horarioServico = horarioServico;
        this.ponto = ponto;
    }

    // Métodos Get/Set
    public Horario getHorarioServico() 
    {
        return horarioServico;
    }

    public boolean getPonto() 
    {
        return ponto;
    }

    public void setHorarioServico(Horario horarioServico) 
    {
        this.horarioServico = horarioServico;
    }

    public void setPonto(boolean ponto) 
    {
        this.ponto = ponto;
    }

    // Retornando todos os dados através do método toString
    @Override
    public String toString() 
    {
        return super.toString() + this.horarioServico.toString() + ", ponto: " + ponto;
    }
}
