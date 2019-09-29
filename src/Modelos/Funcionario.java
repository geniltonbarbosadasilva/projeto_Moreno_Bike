package Modelos;

import Controle.Valida;
import javax.swing.JOptionPane;

/**
 *
 * @author genilton
 */

// // Classe Funcionario herdando da Classe Pessoa
public class Funcionario extends Pessoa
{
    private double salario;
   // Criando os construtores da classe
    
    public Funcionario() 
    {
        this.endereco = new Endereco();
    }

    public Funcionario(String nome, String cpf, String telefone, Endereco endereco, double salario)
    {
        super(nome, cpf, telefone, endereco);
        this.salario = salario;
    }
    
    public Funcionario(String s)
    {                
        super.endereco = new Endereco();
        char [] letras = s.toCharArray();
        s = "";
        for(int i = 0, j = 0; i < letras.length; i++)
        {
            if(letras[i]=='|')
            {
                switch(j)
                {
                    case 0:
                        this.nome = s + '\0';
                    break;
                    case 1:
                        this.salario = Valida.converteDouble(s);
                    break;
                    case 2:
                        this.cpf = s + '\0';
                    break;
                    case 3:
                        this.telefone = s + '\0';
                    break;
                    case 4:
                        super.getEndereco().setRua(s);
                    break;                    
                    case 5:
                        super.getEndereco().setNumero(s);
                    break;                    
                    case 6:
                        super.getEndereco().setBairro(s);
                    break;                    
                    case 7:
                        super.getEndereco().setCidade(s);
                    break;                    
                    case 8:
                        super.getEndereco().setEstado(s);
                    break;                    
                }
                j++;
                s = "";
                continue;
            }
            s = s + letras[i];
        }      
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }        
      
    @Override
    public String toString() {
        return super.toString();
    }
    
        public boolean validaSalario(String salario)
    {
        if (!Valida.isDouble(salario))
        {
            JOptionPane.showMessageDialog(null, "Formato de salario invalido, use apenas numeros, e ponto para separar as casas decimais", "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            if(!salario.isEmpty())
            {
                this.setSalario(Valida.converteDouble(salario));
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Preecha um salario", "ERROR", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
    }
}