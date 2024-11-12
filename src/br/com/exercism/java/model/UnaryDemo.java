package br.com.exercism.java.model;

public class UnaryDemo {
    public static void main(String[] args){
        int result = +1;
        //o resultado agora é 1;
        System.out.println(result);

        result --;
        // o resultado agora é 0
        System.out.println(result);

        result ++;
        // o resultado agora é 1;
        System.out.println(result);

        result = -result;
        //o resultado agora é -1;
        System.out.println(result);

        boolean success = false;
        //false
        System.out.println(success);
        //true;
        System.out.println(!success);
    }
}
