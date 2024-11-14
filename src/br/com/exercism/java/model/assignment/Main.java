package br.com.exercism.java.model.assignment;

public class Main {
    public static void main(String[] args) {
        int sum = new Calculator().add(1,2);
        System.out.println(sum);

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result -1;
        // o resultado agora é 2;
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        //resultado agora é 4;
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        //result is now  2;
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        //resultado agora é 10;
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        //resultado agora é 3;
        System.out.println(original_result + " % 7 = " + result );

    }
}
