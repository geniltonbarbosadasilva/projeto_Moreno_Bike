package principal;

import java.util.Arrays;

/**
 *
 * @author genilton
 */

// Classe Manutenção relacionada com a Interface Serviço
public class Manutencao implements Servico
{
    // Criando os atributos
    private String desc;
    private String notaFiscal;
    private double preco;
    private double []acressimo;
    private Bicicleta bicicleta;

    // Criando os construtores da classe
    public Manutencao() { }

    public Manutencao(String desc, String notaFiscal, double preco, double[] acressimo, Bicicleta bicicleta) 
    {
        this.desc = desc;
        this.notaFiscal = notaFiscal;
        this.preco = preco;
        this.acressimo = acressimo;
        this.bicicleta = bicicleta;
    }

    // Métodos Get/Set
    public String getDesc() 
    {
        return desc;
    }

    public void setDesc(String desc) 
    {
        this.desc = desc;
    }

    public String getNotaFiscal() 
    {
        return notaFiscal;
    }

    public void setNotaFiscal(String notaFiscal) 
    {
        this.notaFiscal = notaFiscal;
    }

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco) 
    {
        this.preco = preco;
    }

    public double[] getAcressimo() 
    {
        return acressimo;
    }

    public void setAcressimo(double[] acressimo) 
    {
        this.acressimo = acressimo;
    }

    public Bicicleta getBicicleta() 
    {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) 
    {
        this.bicicleta = bicicleta;
    }

    
    @Override
    public String toString() {
        return "Manutencao " + desc + ", Nota Fiscal: " + notaFiscal + ", preço: " + this.calculaPreco() + ", bicicleta=" + bicicleta;
    }
    
    @Override
    public double calculaPreco() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
