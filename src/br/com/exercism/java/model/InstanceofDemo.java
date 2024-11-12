package br.com.exercism.java.model;

import javax.swing.text.AsyncBoxView;

public class InstanceofDemo {
    public static void main(String[] args){
        Parent obj1 = new Parent();
        Parent obj2 = new child();

        System.out.println("obj1 instância de Pai: " + (obj1 instanceof Parent));

        System.out.println("obj1 instância de Filho: " + (obj1 instanceof child));

        System.out.println("obj1 instancia de minhaInterface: " +  (obj1 instanceof Myinterface));

        System.out.println("obj2 instancia Parent: " + (obj2 instanceof Parent));

        System.out.println("obj2 instancia Child: " + (obj2 instanceof child));

        System.out.println("obj2 instancia myInterface: " + (obj2 instanceof Myinterface));
    }
}
