package principal;

public class FuncMensalista extends Funcionario
{
    private double salario;

    public FuncMensalista() { }

    public FuncMensalista(String nome, String cpf, String telefone, Endereco endereco, Horario horarioServico, boolean ponto, double salario) 
    {
        super(nome, cpf, telefone, endereco, horarioServico, ponto);
        this.salario = salario;
    }

    public double getSalario() 
    {
        return salario;
    }

    public void setSalario(double salario) 
    {
        this.salario = salario;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", Salario: " + salario;
    }
}
