package br.com.ada.introducaojava.model;

public class EstruturasCondicionais {

    public static void main(String[] args){

        int nota = -1;
        String graduacao;

        //se nota maior ou igual a 70, então aprovado
        //if-else
//
//        if(nota >= 70){
//            System.out.println("Aluno aprovado! ");
//        } else {
//            System.out.println("não aprovado. ");
//        }

        // A80 B70 C60 D0
        if (nota >= 80){
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >=0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao){
            case " A ":
            case " B ":
                System.out.println("Aluno aprovado! ");
                break;
            case " C ":
            case " D ":
                System.out.println("Aluno não aprovado! ");
                break;
            default:
                System.out.println("Graduaçao inválida ");
        }
    }
}
