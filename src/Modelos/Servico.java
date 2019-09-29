package Modelos;

/**
 *
 * @author genilton
 */
public abstract class Servico {    
    protected boolean pago;
    protected Data data;
    protected String cpfCliente;    

    public Servico() 
    {
        this.data = new Data();
    }        
    
    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    
    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
    public Data getData() {
        return data;
    }
    
    public void setData(Data data) {
        this.data = data;
    }


    public abstract double calculaPreco();
}
