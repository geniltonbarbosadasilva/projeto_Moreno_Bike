package principal;

/**
 *
 * @author genilton
 */

public abstract class Funcionario extends Pessoa
{
    protected Horario horarioServico;
    protected boolean ponto;

    public Funcionario() { }

    public Funcionario(String nome, String cpf, String telefone, Endereco endereco, Horario horarioServico, boolean ponto) 
    {
        super(nome, cpf, telefone, endereco);
        this.horarioServico = horarioServico;
        this.ponto = ponto;
    }

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

    @Override
    public String toString() 
    {
        return super.toString() + this.horarioServico.toString() + ", ponto: " + ponto;
    }
}
