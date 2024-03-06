/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mochila;

/**
 *
 * @author User
 */
public class ObjetoMochila {

    //Atributos
    String nombre;
    int peso;
    int valor;


    //constructor
    public ObjetoMochila (String nombre, int peso, int valor){
        this.nombre = nombre;
        this.peso = peso;
        this.valor = valor;
        System.out.println("Se ha creado el Objeto: " + nombre +" con [Peso: " + peso + " , Valor: "+ valor+"]");
    }  

    @Override
    public String toString() {
        return "Objeto: " + nombre +" con [Peso: " + peso + " , Valor: "+ valor+"]";
    }
    
    
}
