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
public class ejercicio_14conFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;
        do {
            int opcion = menu();
            int monto = cantidad();
            convertir(opcion, monto);
            System.out.println("Desea continuar S/N");
            continuar = sc.nextLine();

        } while ("s".equalsIgnoreCase(continuar));

    }

    public static int menu() {
        Scanner sc = new Scanner(System.in);
        int retorno = 0;
        System.out.println("---------------------------");
        System.out.println("|   CONVERTIR EUROS A:    |");
        System.out.println("---------------------------");
        System.out.println("1- DOLARES                 ");
        System.out.println("2- YENES                   ");
        System.out.println("3- LIBRAS                  ");
        System.out.println("---------------------------");
        retorno = sc.nextInt();
        System.out.println(" ");
        while (retorno < 0 || retorno > 3) {
            System.out.println("Ingrese una opción correcta");
            System.out.println(" ");
            retorno = sc.nextInt();
        }

        return retorno;
    }

    public static int cantidad() {
        Scanner sc = new Scanner(System.in);
        int respuesta;
        System.out.println("Ingrese el monto de Euros");
        respuesta = sc.nextInt();
        System.out.println(" ");
        return respuesta;
    }

    public static int convertir(int opcion, int monto) {
        Scanner sc = new Scanner(System.in);
        double moneda = 0;
        String tipo = " ";
        switch (opcion) {
            case 1:
                tipo = "Dolares";
                moneda = 1.28611;
                break;
            case 2:
                tipo = "Yenes";
                moneda = 129.852;
                break;
            case 3:
                tipo = "Libras";
                moneda = 0.86;
                break;
            default:
                System.out.println("La opción selecionada es incorrecta");
                break;
        }
        System.out.println("Son " + moneda * monto + " " + tipo);
        System.out.println(" ");
        return monto;

    }
}
