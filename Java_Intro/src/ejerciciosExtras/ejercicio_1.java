/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Ivan
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos");
        int minutos = sc.nextInt();
        int horas, horaFinal, dias;
        horas = minutos / 60;
        dias = Math.round(horas / 24);
        horaFinal = horas - (dias * 24);
        int minutosFinal = minutos - (horaFinal * 60) - (dias * 1440);
        System.out.println("Son " + dias + " días, " + horaFinal + " horas y " + minutosFinal + " minutos");
    }
    
}
