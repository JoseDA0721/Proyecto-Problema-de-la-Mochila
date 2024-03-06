/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mochila;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MochilaTest {
    int [][] arregloMochila;

    public void llenarMochila (ArrayList<ObjetoMochila> listaObejtos, int tamanoMochila) {
        int tamanoMochilaMaximo = tamanoMochila;
        ObjetoMochila objActual;
        arregloMochila = new int[listaObejtos.size()+1][tamanoMochila+1];
        
        
        
        for (int i = 0; i < listaObejtos.size(); i++) {
            objActual = listaObejtos.get(i);
            for (int j = 0; j <= tamanoMochilaMaximo; j++) {
                
                if (i == 0) {
                    if (j >= objActual.peso) {
                        arregloMochila[i][j] = objActual.valor;
                    }
                } else if (j < objActual.peso) {
                    arregloMochila[i][j] = arregloMochila[i - 1][j];
                } else {
                    arregloMochila[i][j] = Math.max(arregloMochila[i - 1][j], objActual.valor + arregloMochila[i - 1][j - objActual.peso]);
                }
            }
        }
        
        //Imprimir la tabla
        System.out.println("\nTabla generada");
        for (int i = 0; i<listaObejtos.size(); i++){
            for (int j = 0;j<=tamanoMochila; j++){
                System.out.printf("%3d ", arregloMochila[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();

        //Maximizar Valor de la Mochila
        ArrayList<Integer> objetos = maximizarValor(listaObejtos, tamanoMochila);
        
        //Resultados
        System.out.println("Objetos seleccionados para llenar la mochila: ");
        
        for(int i = 0; i<objetos.size(); i++)
            System.out.println("    " + listaObejtos.get(objetos.get(i)-1));
        
        System.out.println("Peso de la mochila: " + (tamanoMochila-1));
        System.out.println("Valor de la mochila: " + arregloMochila[(objetos.get(0))-1][tamanoMochila-1]);
    }
    
    private ArrayList maximizarValor(ArrayList<ObjetoMochila> listaObejtos, int tamanoMochila){
        ObjetoMochila objActual;
        ArrayList<Integer> objetos = new ArrayList<>();
        int j = tamanoMochila;

        for (int i = listaObejtos.size()-1; i > 0; i--) {
            objActual = listaObejtos.get(i);
            if (arregloMochila[i][j] != arregloMochila[i - 1][j] && arregloMochila[i][j] == arregloMochila[i - 1][j - objActual.peso] + objActual.valor) {
                objetos.add(i+1);
                j -= objActual.peso;
            }
        }
        return objetos;
    }
}
