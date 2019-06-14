package principal;

/**
 *
 * @author genilton
 */

// Classe Aprendiz herdando de Funcionario
public class Aprendiz extends Funcionario
{
    // Criando os atributos
    private int horas;
    private double valorHora;

    // Criando os construtores da classe
    public Aprendiz() { }

    public Aprendiz(String nome, String cpf, String telefone, Endereco endereco, Horario horarioServico, boolean ponto, int horas, double valorHora) 
    {
        super(nome, cpf, telefone, endereco, horarioServico, ponto);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    // Métodos Get/Set
    public int getHoras() 
    {
        return horas;
    }

    public double getValorHora() 
    {
        return valorHora;
    }

    public void setHoras(int horas) 
    {
        this.horas = horas;
    }

    public void setValorHora(double valorHora) 
    {
        this.valorHora = valorHora;
    }

    // Retornando todos os dados através do método toString
    @Override
    public String toString() 
    {
        return super.toString() + ", Horas Trabalhadas: " + horas + ", Valor da Hora: " + valorHora;
    }
}
