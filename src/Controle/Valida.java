/*
 * Essa Classe foi criada para validar e controlar os dados
 */
package Controle;

/**
 *
 * @author genilton
 */
public class Valida 
{
    public static boolean temLetra(String s)
    {
        char [] letras = s.toCharArray();
        for(int i = 0; i < letras.length; i++)
        {
            if ( letras[i] != '1' &&
                 letras[i] != '2' &&
                 letras[i] != '3' &&
                 letras[i] != '4' &&
                 letras[i] != '5' &&
                 letras[i] != '6' &&
                 letras[i] != '7' &&
                 letras[i] != '8' &&
                 letras[i] != '9' &&
                 letras[i] != '0' &&
                 letras[i] != '\0' 
                )
            {
                return true;
            }
        }
        return false;
    }

    public static boolean isDouble(String s)
    {                
        char [] letras = s.toCharArray();
        for(int i = 0; i < letras.length; i++)
        {
            if ( letras[i] != '1' &&
                 letras[i] != '2' &&
                 letras[i] != '3' &&
                 letras[i] != '4' &&
                 letras[i] != '5' &&
                 letras[i] != '6' &&
                 letras[i] != '7' &&
                 letras[i] != '8' &&
                 letras[i] != '9' &&
                 letras[i] != '0' &&
                 letras[i] != '.' &&
                 letras[i] != '\0' 
                )
            {
                return false;
            }
        }
        
        for(int i = 0, count = 0; i < letras.length; i++)
        {
            if (letras[i] == '.')
            {
                count++;
                if(count>1)
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static int converteInt(String s)
    {
        s = s.trim();
        if(s.isEmpty() || Valida.temLetra(s))
        {
            return 0;
        }
        else
        {
            return Integer.parseInt(s);
        }
    }
        
    public static double converteDouble(String s)
    {
        s = s.trim();
        if(s.isEmpty() || !Valida.isDouble(s))
        {
            return (0);
        }
        else
        {
            return Double.parseDouble(s);
        }
    }             
    
    public static boolean converteBoolean(String s)
    {
        s = s.trim();
        return !(s.equals("false") || s.contains("false"));
    }
}