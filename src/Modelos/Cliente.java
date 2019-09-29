package Modelos;

/**
 *
 * @author genilton
 */

// // Classe Cliente herdando da Classe Pessoa
public class Cliente extends Pessoa
{
   // Criando os construtores da classe
    
    public Cliente() 
    {
        this.endereco = new Endereco();
    }

    public Cliente(String nome, String cpf, String telefone, Endereco endereco)
    {
        super(nome, cpf, telefone, endereco);
    }
    
    public Cliente(String s)
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
                        this.cpf = s + '\0';
                    break;
                    case 2:
                        this.telefone = s + '\0';
                    break;
                    case 3:
                        super.getEndereco().setRua(s);
                    break;                    
                    case 4:
                        super.getEndereco().setNumero(s);
                    break;                    
                    case 5:
                        super.getEndereco().setBairro(s);
                    break;                    
                    case 6:
                        super.getEndereco().setCidade(s);
                    break;                    
                    case 7:
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
      
    @Override
    public String toString() {
        return super.toString();
    }
}