package principal;

/**
 *
 * @author genilton
 */

public class Aprendiz extends Funcionario
{
    private int horas;
    private double valorHora;

    public Aprendiz() { }

    public Aprendiz(String nome, String cpf, String telefone, Endereco endereco, Horario horarioServico, boolean ponto, int horas, double valorHora) 
    {
        super(nome, cpf, telefone, endereco, horarioServico, ponto);
        this.horas = horas;
        this.valorHora = valorHora;
    }

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

    @Override
    public String toString() 
    {
        return super.toString() + ", Horas Trabalhadas: " + horas + ", Valor da Hora: " + valorHora;
    }
}
