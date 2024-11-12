package br.com.exercism.java.model;

public class ConditionalDemo2 {
    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        int result;

        boolean somecondition = true;
        result = somecondition ? value1 : value2;

        System.out.println(result);

    }
}
