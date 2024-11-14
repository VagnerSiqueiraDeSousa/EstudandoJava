package br.com.ada.introducaojava.model;

public class Funcoes {
    public static void main(String[] args){
        String nomeOriginal = "Let's code";
        saudacao(nomeOriginal);
    }
//metodo
    public static void saudacao(String nomeParemetro){
        System.out.println("Hello, " + nomeParemetro);
    }
}
