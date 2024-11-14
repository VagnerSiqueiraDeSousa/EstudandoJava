package br.com.ada.introducaojava.model;

public class main {
    public static void main(String[] args){

        String name = "Vagner";
        System.out.println("Hello, " + name);

        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float) a / b;
        float restoDaDivisao = (float) a % b;

        System.out.println("a + b = " + soma);
        System.out.println("a - b = " + subtracao);
        System.out.println("a x b = " + multiplicacao);
        System.out.println("a / b = " + divisao);
        System.out.println("resto da divisão = " + restoDaDivisao);

        System.out.println();

    }
}
