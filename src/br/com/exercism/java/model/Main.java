package br.com.exercism.java.model;

import br.com.exercism.java.model.bicycle.Bicycle;

public class Main {
    public static void main(String[] args){
        Bicycle myBicycle = new Bicycle(30,0,8);
        System.out.println(myBicycle);

        Bicycle yourBike = new Bicycle();
        System.out.println(yourBike);
    }
}
