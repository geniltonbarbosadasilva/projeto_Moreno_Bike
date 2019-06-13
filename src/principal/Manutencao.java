package principal;

import java.util.Arrays;

/**
 *
 * @author genilton
 */

public class Manutencao implements Servico
{
    private String desc;
    private String notaFiscal;
    private double preco;
    private double []acressimo;
    private Bicicleta bicicleta;

    public Manutencao() { }

    public Manutencao(String desc, String notaFiscal, double preco, double[] acressimo, Bicicleta bicicleta) 
    {
        this.desc = desc;
        this.notaFiscal = notaFiscal;
        this.preco = preco;
        this.acressimo = acressimo;
        this.bicicleta = bicicleta;
    }

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
