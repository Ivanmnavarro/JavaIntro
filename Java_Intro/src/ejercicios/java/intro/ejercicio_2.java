/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejercicios.java.intro;

import java.util.Scanner;

/**
 *
 * @author Ivan
 * 
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
*/

public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String nombre;
        System.out.println("Ingresa tu nombre");
        nombre=leer.nextLine();
        System.out.println("Este es tu nombre: " + nombre);
    }
    
}
