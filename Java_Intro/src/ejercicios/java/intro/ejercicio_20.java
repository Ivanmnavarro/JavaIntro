/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.java.intro;

import java.util.Scanner;

/**
 *
 * @author Ivan 
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números
 * del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
 * idénticas. Crear un programa que permita introducir un cuadrado por teclado y
 * determine si este cuadrado es mágico o no. El programa deberá comprobar que
 * los números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
public class ejercicio_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] vectorMagico = new int[3][3];
        int diagonal = 0;
        int fila = 0;
        int columna = 0;
        int diagonalInvertida = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingrese los valores");
                vectorMagico[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    diagonal += vectorMagico[i][j];
                }
            }
        }//System.out.println(diagonal);
        for (int i = 0; i < 3; i++) {
            fila = 0;
            for (int j = 0; j < 3; j++) {
                fila += vectorMagico[i][j];
            }
            if (fila == diagonal) {
                cont1++;
            }
        }
        for (int j = 0; j < 3; j++) {
            columna = 0;
            for (int i = 0; i < 3; i++) {
                columna += vectorMagico[i][j];
            }
            if (columna == diagonal) {
                cont2++;
            }
        }
        System.out.println(cont2);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 2) {
                    diagonalInvertida += vectorMagico[i][j];
                }
            }
            if (diagonalInvertida == diagonal) {
                cont3++;
            }
        }
        cont4 = cont1 + cont2 + cont3;
        if (cont4 == 7) {
            System.out.println("La matriz es magica");
        } else {
            System.out.println("La matriz no es magica");
        }
    }

}
