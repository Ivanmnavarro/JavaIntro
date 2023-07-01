/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Ivan 
 * Elaborar un algoritmo en el cuál se ingrese una letra y se
 * detecte si se trata de una vocal. Caso contrario mostrar un mensaje. Nota:
 * investigar la función equals() de la clase String.
 */
public class ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = sc.nextLine();
        String letraMay = letra.toUpperCase();
        switch (letraMay) {
            case "A":
                System.out.println("Es una vocal");
                break;
            case "E":
                System.out.println("Es una vocal");
                break;
            case "I":
                System.out.println("Es una vocal");
                break;
            case "O":
                System.out.println("Es una vocal");
                break;
            case "U":
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");
                break;
        }
    }

}
