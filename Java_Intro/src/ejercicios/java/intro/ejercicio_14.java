/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.java.intro;

import java.util.Scanner;

/**
 *
 * @author Ivan
 * Crea una aplicación que a través de una función nos convierta
 * una cantidad de euros introducida por teclado a otra moneda, estas pueden ser
 * a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de
 * euros y la moneda a converir que será una cadena, este no devolverá ningún
 * valor y mostrará un mensaje indicando el cambio (void). El cambio de divisas
 * es: 0.86 libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 */
public class ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int opcion2 = 0;
        int monto = 0;
        String respuesta = "n";
        do {
            System.out.println("Ingrese el monto en EUROS");
            monto = sc.nextInt();
            System.out.println("ELIGA LA MONEDA A CONVERTIR");
            System.out.println("---------------------------");
            System.out.println("1- DOLARES                 ");
            System.out.println("2- YENES                   ");
            System.out.println("3- LIBRAS                  ");
            System.out.println("4- SALIR                  ");
            System.out.println("---------------------------");
            opcion = sc.nextInt();
            System.out.println(" ");

            switch (opcion) {
                case 1:
                    System.out.println("Son " + (1.28611 * monto) + " dolares");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Son " + (129.852 * monto) + " yenes");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Son " + (0.86 * monto) + " libras");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Realmente desea salir S/N");
                    respuesta = sc.next();
                    break;
                default:
                    System.out.println("Elija una opcion correcta");
                    System.out.println(" ");
                    break;
            }
        } while ("n"==respuesta);
    }

}
