/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.java.intro;

import java.util.Scanner;

/**
 *
 * @author Ivan 
 * Dibujar un cuadrado de N elementos por lado utilizando el
 * carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se
 * deberá dibujar lo siguiente: * * * * * * * *
 */
public class ejercicio_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                } //System.out.println(" ");
            } else if (i != 0 || i != n - 1) {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n - 1) {
                        System.out.print("*");
                    } else if (j != 0 || j != n - 1) {
                        System.out.print(" ");
                    }
                }
            }
           System.out.println(" ");
        }
    }

}
