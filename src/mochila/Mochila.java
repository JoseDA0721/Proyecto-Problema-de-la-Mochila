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
public class Mochila {
int [][] arregloMochila;

    public void llenarMochila (ArrayList<ObjetoMochila> listaObejtos, int tamanoMochila) {
        tamanoMochila = tamanoMochila+1;
        ObjetoMochila objActual;
        arregloMochila = new int[listaObejtos.size()][tamanoMochila];
        
        
        for (int j = 0; j<listaObejtos.size(); j++) {
            objActual = listaObejtos.get(j);
            for (int i = 0; i<tamanoMochila; i++){
                if (objActual.peso>i){

                    //si es de la primera fila asignamos i
                    if(j==0){
                        arregloMochila[j][i] = i;
                    }else {
                        arregloMochila[j][i] = arregloMochila[j-1][i];
                    }

                    //copiamos al del inmediato superior en columnas
                //Si es igual o menor al peso de la mochila
                }else {
                    if(j==0){
                        arregloMochila[j][i] = objActual.valor;
                    }else {

                        int columnaPeso = i - objActual.peso;
                        arregloMochila[j][i] = arregloMochila[j-1][columnaPeso] + objActual.valor;
                    }

                }
            }
        }
        
        //Imprimir la tabla
        System.out.println("\nTabla generada");
        for (int i = 0; i<listaObejtos.size(); i++){
            for (int j = 0;j<tamanoMochila; j++){
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
        int j = tamanoMochila-1;
        
        for (int i = listaObejtos.size()-1; i > -1; i--) {
            objActual = listaObejtos.get(i);
            if (i != 0 && arregloMochila[i][j] != arregloMochila[i - 1][j] && arregloMochila[i][j] == arregloMochila[i - 1][j - objActual.peso] + objActual.valor) {
                objetos.add(i+1);
                j -= objActual.peso;
            }
            if (i == 0){
                if(arregloMochila[i][j] == arregloMochila[i][j - objActual.peso] + objActual.valor){
                    objetos.add(i+1);                   
                }
            }
        }  
        return objetos;
    }
}
