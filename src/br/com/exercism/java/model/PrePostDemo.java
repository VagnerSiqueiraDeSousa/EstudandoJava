package br.com.exercism.java.model;

public class PrePostDemo {
    public static void main(String[] args){

        int i = 3;
        i++;
        //prints 4
        System.out.println(i);


        i++;
        System.out.println(i);
        //prints 5


        System.out.println(++i);
        //prints 6

        System.out.println(i++);
        //prints 6


        System.out.println(i);
        //prints7
    }
}
