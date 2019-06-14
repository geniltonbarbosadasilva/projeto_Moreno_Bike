package principal;

/**
 *
 * @author genilton
 */

public class Horario 
{
    // Criando os atributos
    private int horaEntrada;
    private int horaSaida;

    // Criandos os construtores da classe
    public Horario() { }

    public Horario(int horaEntrada, int horaSaida) 
    {
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    // métodos Get/Set 
    public int getHoraEntrada() 
    {
        return horaEntrada;
    }

    public int getHoraSaida() 
    {
        return horaSaida;
    }

    public void setHoraEntrada(int horaEntrada) 
    {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(int horaSaida) 
    {
        this.horaSaida = horaSaida;
    }

    // // Retornando todos os dados através do método toString
    @Override
    public String toString() {
        return "Horario: " + "Entrada as " + horaEntrada + ", Saida as " + horaSaida;
    }
}
