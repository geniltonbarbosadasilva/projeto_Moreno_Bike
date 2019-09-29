package Modelos;

import Controle.Valida;
import javax.swing.JOptionPane;


/**
 *
 * @author genilton
 */

// Classe Manutenção relacionada com a Interface Serviço
public class Manutencao extends Servico
{
    // Criando os atributos
    private String desc;
    private double preco;

    // Criando os construtores da classe
    public Manutencao() { }

    public Manutencao(String desc, String notaFiscal, double preco, double[] acressimo) 
    {
        this.desc = desc;
        this.preco = preco;
    }
    
    public Manutencao(String s)
    {                        
        char [] letras = s.toCharArray();
        s = "";
        for(int i = 0, j = 0; i < letras.length; i++)
        {
            if(letras[i]=='|')
            {
                switch(j)
                {
                    case 0:
                        super.cpfCliente = s + '\0';
                    break;
                    case 1:
                        super.data.setDia(Valida.converteInt(s));
                    break;
                    case 2:
                        super.data.setMes(Valida.converteInt(s));
                    break;
                    case 3:
                        super.data.setAno(Valida.converteInt(s));
                    break;                    
                    case 4:
                        super.pago = Valida.converteBoolean(s);
                    break;                    
                    case 5:
                        this.preco = Valida.converteDouble(s);
                    break;
                    case 6:
                        this.desc = "" + s + '\0';
                    break;                    
                }
                j++;
                s = "";
                continue;
            }
            s = s + letras[i];
        }      
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

    public double getPreco() 
    {
        return preco;
    }

    public void setPreco(double preco) 
    {
        this.preco = preco;
    }

    
    @Override
    public String toString() {
        return "Manutencao " + desc + ", preço: " + this.calculaPreco();
    }
    
    @Override
    public double calculaPreco() {
        return this.preco;
    }
    
    public boolean validaDesc(String desc)
    {
        if(desc.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "A descrição não pode ser vazio", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else 
        {
            if(desc.contains("|"))
            {
                JOptionPane.showMessageDialog(null, "O descrição não pode ter caracteres especiais", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else 
            {
                this.setDesc(desc);
                return true;
            }
        }
    }        
    
    public boolean validaPreco(String preco)
    {
        if (!Valida.isDouble(preco))
        {
            JOptionPane.showMessageDialog(null, "Formato de preco invalido, use apenas numeros, e ponto para separar as casas decimais", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if(!preco.isEmpty())
            {
                this.setPreco(Valida.converteDouble(preco));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Preecha um preço", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
}
