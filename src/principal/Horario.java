package principal;

/**
 *
 * @author genilton
 */

public class Horario 
{
    private int horaEntrada;
    private int horaSaida;

    public Horario() { }

    public Horario(int horaEntrada, int horaSaida) 
    {
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

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

    @Override
    public String toString() {
        return "Horario: " + "Entrada as " + horaEntrada + ", Saida as " + horaSaida;
    }
}
