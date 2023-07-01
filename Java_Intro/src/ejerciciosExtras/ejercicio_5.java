/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author Ivan 
 * Una obra social tiene tres clases de socios: o Los socios tipo
 * ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los
 * tipos de tratamientos. o Los socios tipo ‘B’ abonan una cuota moderada y
 * tienen un 35% de descuento para los mismos tratamientos que los socios del
 * tipo A. o Los socios que menos aportan, los de tipo ‘C’, no reciben
 * descuentos sobre dichos tratamientos. o Solicite una letra (carácter) que
 * representa la clase de un socio, y luego un valor real que represente el
 * costo del tratamiento (previo al descuento) y determine el importe en
 * efectivo a pagar por dicho socio.
 */
public class ejercicio_5 {
    public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String opcion = menu();
        int costo = importe();
        descuento(opcion, costo);

    }

    public static String menu() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("ELIJA LA CLASE DE SOCIO");
        System.out.println("-----------------------");
        System.out.println("A                      ");
        System.out.println("B                      ");
        System.out.println("C                      ");
        System.out.println("-----------------------");
        String opcion = sc.nextLine();
        return opcion.toUpperCase();

    }

    public static int importe() {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor del tratamiento");
        int importe = sc.nextInt();
        return importe;

    }

    public static int descuento(String opcion, int costo) {
        switch (opcion) {
            case "A":
                System.out.println("El importe a pagar es $" + costo * 0.5);

                break;
            case "B":
                System.out.println("El importe a pagar es $" + costo * 0.65);

                break;
            case "C":
                System.out.println("El importe a pagar es $" + costo );

                break;

        }
        return 0;
    }
}
