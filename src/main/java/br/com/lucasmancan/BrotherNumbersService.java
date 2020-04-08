package br.com.lucasmancan;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BrotherNumbersService {

    private Set<Integer> getBrotherNumbers(int n) {

        char[] values = String.valueOf(n).toCharArray();

        return this.getBrotherNumbersPossibilities(values, 0);
    }


    /*
    * TODO Melhorar lógica para reduzir iterações e eliminar necessidade do Set
    *
    * */

    private Set<Integer> getBrotherNumbersPossibilities(char[] values, int index) {

        Set<Integer> set = new HashSet<Integer>();

        if (values.length == index) {
            String string = String.valueOf(values);
            set.add(Integer.valueOf(string));
            return set;
        }

        for (int i = index; i < values.length; i++) {
            for (int j = 0; j < values.length - 1; j++) {
                char aux = values[j];
                values[j] = values[j + 1];
                values[j + 1] = aux;

                set.addAll(getBrotherNumbersPossibilities(values, index + 1));
            }
        }

        return set;
    }

    public int getBiggestBrother(int n){

        int max = Collections.max(getBrotherNumbers(n));

        if(max > 100000000)
            return -1;

        return max;
    }


}
