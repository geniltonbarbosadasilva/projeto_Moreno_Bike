package principal;

// Classe FuncMensalista herdando da Classe Funcionario
public class FuncMensalista extends Funcionario
{    
    //Criando os atributos
    private double salario;

    // Criando os construtores da classe
    public FuncMensalista() { }

    public FuncMensalista(String nome, String cpf, String telefone, Endereco endereco, Horario horarioServico, boolean ponto, double salario) 
    {
        super(nome, cpf, telefone, endereco, horarioServico, ponto);
        this.salario = salario;
    }

    // Métodos Get/Set
    public double getSalario() 
    {
        return salario;
    }

    public void setSalario(double salario) 
    {
        this.salario = salario;
    }

    // Retornando todos os dados através do método toString
    @Override
    public String toString() 
    {
        return super.toString() + ", Salario: " + salario;
    }
}
