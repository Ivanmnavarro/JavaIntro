/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios.java.intro;

import java.util.Scanner;

/**
 *
 * @author Ivan 
 * Realizar un programa que simule el funcionamiento de un
 * dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el
 * usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un
 * máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el
 * último tiene que ser una O. Las secuencias leídas que respeten el formato se
 * consideran correctas, la secuencia especial “&&&&&” marca el final de los
 * envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el
 * formato se considera incorrecta. Al finalizar el proceso, se imprime un
 * informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
 * Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes
 * funciones de Java Substring(), Length(), equals().
 */
public class ejercicio_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitud = 0;
        String primerLetra, ultimaLetra, secuencia;
        secuencia = " ";
        int cont = 0;
        do {
            System.out.println("Ingrese la secuencia");

            secuencia = sc.nextLine();

            longitud = secuencia.length();

            primerLetra = secuencia.substring(0, 1);

            ultimaLetra = secuencia.substring(longitud-1, longitud);

            if (longitud == 5 && "x".equalsIgnoreCase(primerLetra) && "o".equalsIgnoreCase(ultimaLetra)) {

                cont = cont + 1;
            }

        } while (!"&&&&&".equals(secuencia));

        System.out.println("Ingreso " + cont + " secuencias correctas");

    }


}
