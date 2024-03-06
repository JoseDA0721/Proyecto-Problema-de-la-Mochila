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
        

    }
    
}
