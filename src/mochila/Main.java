/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mochila;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejemplo Presentación
        System.out.println("\nEjemplo Presentacion");
        ObjetoMochila obj1 = new ObjetoMochila("Obj1", 1, 1);
        ObjetoMochila obj2 = new ObjetoMochila("Obj2", 2, 4);
        ObjetoMochila obj3 = new ObjetoMochila("Obj3", 3, 5);
        ObjetoMochila obj4 = new ObjetoMochila("Obj4", 4, 7);

        ArrayList<ObjetoMochila> listaObjetos = new ArrayList<>();
        listaObjetos.add(obj1);
        listaObjetos.add(obj2);
        listaObjetos.add(obj3);
        listaObjetos.add(obj4);

        Mochila mochila1 = new Mochila();
        mochila1.llenarMochila(listaObjetos,7);
        
        
        //Ejemplo Presentación
        System.out.println("\nEjemplo 2");
        ObjetoMochila obj11 = new ObjetoMochila("A", 1, 2);
        ObjetoMochila obj22 = new ObjetoMochila("B", 2, 5);
        ObjetoMochila obj33 = new ObjetoMochila("C", 4, 6);
        ObjetoMochila obj44 = new ObjetoMochila("D", 5, 10);
        ObjetoMochila obj45 = new ObjetoMochila("E", 7, 13);
        ObjetoMochila obj46 = new ObjetoMochila("F", 8, 16);

        Mochila mochila2 = new Mochila();

        ArrayList<ObjetoMochila> listaObjetos2 = new ArrayList<>();
        listaObjetos2.add(obj11);
        listaObjetos2.add(obj22);
        listaObjetos2.add(obj33);
        listaObjetos2.add(obj44);
        listaObjetos2.add(obj45);
        listaObjetos2.add(obj46);
        mochila2.llenarMochila(listaObjetos2,8);
       
    }
    
}
