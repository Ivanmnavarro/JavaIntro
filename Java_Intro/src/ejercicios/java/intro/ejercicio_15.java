/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.java.intro;

/**
 *
 * @author Ivan 
 * Realizar un algoritmo que rellene un vector con los 100 primeros
 * números enteros y los muestre por pantalla en orden descendente.
 */
public class ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[101];
        rellenar(vector);
        mostrarVector(vector);
        
    }
    

    public static int[] rellenar(int vector[]) {
        for (int i = 0; i < 101; i++) {
            vector[i] = i;
        }
        return vector;
    }

    public static int mostrarVector(int vector[]) {
        for (int i = 0; i < 101; i++) {
            System.out.print("["+ vector[i]+"]");

        }
        return 0;

    }

}
