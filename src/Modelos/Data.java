package Modelos;

import Controle.Valida;
import javax.swing.JOptionPane;

/**
 *
 * @author genilton
 */
public class Data 
{
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String dd = "" + this.dia;
        String mm = "" + this.mes;
        String aa = "" + this.ano;
        
        if(this.dia < 10)
        {
            dd = "0" + this.dia;
        }
        if(this.mes < 10)
        {
            mm = "0" + this.mes;
        }
        if(this.ano < 10)
        {
            aa = "0" + this.ano;
        }
        return dd + "/" + mm + "/" + aa;
    }
    
    public String formatado() {
        return this.dia + "|" + this.mes + "|" + this.ano;
    }

    
    public boolean validaDia(String dia)
    {        
        if (dia.length() > 2)
        {
            JOptionPane.showMessageDialog(null, "O dia não pode ter mais de dois digitos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        if (Valida.temLetra(dia))
        {
            JOptionPane.showMessageDialog(null, "A data não pode conter letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {            
            if(!dia.isEmpty())
            {
                if(Valida.converteInt(dia) > 31 || Valida.converteInt(dia) < 1)
                {
                    JOptionPane.showMessageDialog(null, "Esse dia não existe", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                this.setDia(Valida.converteInt(dia));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Preencha uma data", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
    
    public boolean validaMes(String mes)
    {
        if (mes.length() > 2)
        {
            JOptionPane.showMessageDialog(null, "O mesa não pode ter mais de dois digitos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        if (Valida.temLetra(mes))
        {
            JOptionPane.showMessageDialog(null, "A data não pode conter letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if(!mes.isEmpty())
            {
                if(Valida.converteInt(mes) > 12 || Valida.converteInt(mes) < 1)
                {
                    JOptionPane.showMessageDialog(null, "Esse mes não existe", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }                
                this.setMes(Valida.converteInt(mes));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Preencha uma data", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
    public boolean validaAno(String ano)
    {
        if (ano.length() > 2)
        {
            JOptionPane.showMessageDialog(null, "O ano não pode ter mais de dois digitos", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        if (Valida.temLetra(ano))
        {
            JOptionPane.showMessageDialog(null, "A data não pode conter letras", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if(!ano.isEmpty())
            {
                if(Valida.converteInt(ano) < 1)
                {
                    JOptionPane.showMessageDialog(null, "Esse ano não existe", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                this.setAno(Valida.converteInt(ano));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Preencha uma data", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
}
