package Modelos;

import Controle.Valida;

/**
 *
 * @author genilton
 */

// Classe Venda relacionada com a Interface Serviço
public class Venda extends Servico
{
    private Produto produto;
    

    // Criando os Construtores da classe
    public Venda() 
    {    
        this.produto = new Produto();
    }
    
    public Venda(String s)
    {                        
        this.produto = new Produto();
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
                        this.produto.setCodigo( (Valida.converteInt(s)) );
                    break;
                    case 6:
                        this.produto.setNome(s + '\0');
                    break;
                    case 7:
                        this.produto.setPreco(Valida.converteDouble(s));
                    break;
                    case 8:
                        this.produto.setQtd(Valida.converteInt(s));
                    break;
                }
                j++;
                s = "";
                continue;
            }
            s = s + letras[i];
        }      
    }

    public Produto getProdutos() {
        return this.produto;
    }

    public void setProdutos(Produto produto) {
        this.produto = produto;
    }    
                
    @Override
    public double calculaPreco() {
        return this.produto.getPreco()*this.produto.getQtd();
    }
}
