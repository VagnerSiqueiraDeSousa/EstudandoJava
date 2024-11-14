package br.com.ada.introducaojava.model;

public class OperadoresLogicos {
    public static void main(String[] args){

       boolean weekend = false;
       boolean withSun = true;
       boolean letsGoToTheBeach = weekend && withSun;

        System.out.println(letsGoToTheBeach);

        //operador ternario

        String message = weekend ? "It's the weekend" : "It's not the weekend";
        System.out.println(message);

    }
}
