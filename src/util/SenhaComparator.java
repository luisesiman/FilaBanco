package util;

import java.util.Comparator;
import modelo.Senha;

/**
 *
 * @author Usuário
 */
public class SenhaComparator implements Comparator {

    //Primeiramente, compara o tipo de senha. Depois disso, compara o horário de chegada
    
    @Override
    public int compare(Object o1, Object o2) {
        Senha s1 = (Senha) o1;
        Senha s2 = (Senha) o2;
        Integer tipo1 = s1.getTipo();
        Integer tipo2 = s2.getTipo();
        int comp = tipo2.compareTo(tipo1);
        if (comp != 0) {
            return comp;
        }else{
            return s1.getHoraretirada().compareTo(s2.getHoraretirada());
        }

    }

}
