package Intefarce;

/**
 *
 * @author genilton
 */

public interface Controles 
{
    static final String CAMINHO = "src//Aquivos//";
    
    public abstract void inicializa();
    
    public abstract void grava();
    
    public abstract void apaga(int i);

    public abstract void busca(int opc, String s);
    
    public abstract void cadastra(Object o);
}
