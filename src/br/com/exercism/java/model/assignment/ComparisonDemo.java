package br.com.exercism.java.model.assignment;

public class ComparisonDemo {
    public static void main(String[] args) {
//         == igual a;
//         != diferente de;
//         > maior que;
//         >= maior igual a;
//         < menor que;
//         <= menor ou igual a;

     int valor1 = 1;
     int valor2 = 2;

     if(valor1 == valor2)
        System.out.println("valor1 igual a valor 2");

     if(valor1 != valor2)
         System.out.println("valor1 diferente de  valor2");

     if(valor1 > valor2)
         System.out.println("valor1 maior que valor2");

     if (valor1 < valor2)
         System.out.println("valor1 menor que valor2");

     if (valor1 <= valor2)
         System.out.println("valor1 é menor ou igual valor2");

    }
}
