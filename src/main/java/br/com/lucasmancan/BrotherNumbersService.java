package br.com.lucasmancan;

import br.com.lucasmancan.exceptions.InvalidValueException;

import java.util.*;

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


    /**
     * Utilizando recursos do Java 8
     * @param n número natural
     * @return maior número irmão de n
     */
    public int getBiggestBrotherUsingStreamApi(int n) throws InvalidValueException {

        if (n < 0) {
            throw new InvalidValueException("Invalid value.");
        }

        String[] elements = String.valueOf(n).split("");

        if(elements.length >= 9)
            return -1;

        Optional<String> stringValue = Arrays.stream(elements)
                .sorted(Comparator.reverseOrder())
                .reduce(String::concat);

        return stringValue.isPresent() ? Integer.parseInt(stringValue.get()) : null;
    }

    /**
     * @param n número natural
     * @return maior número irmão de n
     */
    public int getBiggestBrother(int n) throws InvalidValueException {

        if (n < 0) {
            throw new InvalidValueException("Invalid value.");
        }

        char[] elements = String.valueOf(n).toCharArray();

        if(elements.length >= 9)
            return -1;

        this.sort(elements);

        return Integer.parseInt(String.valueOf(elements));
    }

    private void sort(char[] elements) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                if(elements[i] < elements[j]){
                    char aux = elements[i];
                    elements[i] = elements[j];
                    elements[j] = aux;
                }
            }
        }
    }


}
