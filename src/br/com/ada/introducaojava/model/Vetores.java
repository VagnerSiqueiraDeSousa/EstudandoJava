package br.com.ada.introducaojava.model;

import java.util.Arrays;
import java.util.Formattable;
import java.util.List;

public class Vetores {
    public static void main(String[] args) {

        int [] numeros = new int[5];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }

        String[] letras = {"A", "B", "C", "J", "X"};
        for (int i = 0; i <letras.length; i++){
            System.out.println(letras[i]);
        }

        System.out.println(Arrays.toString(letras));

    }
}
