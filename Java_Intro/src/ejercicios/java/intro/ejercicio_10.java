
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ivan
 */
/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
public class ejercicio_10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número maximo");
        int num = leer.nextInt();
        int suma;
        suma = 0;
        do {
            System.out.println("Ingrese un número");
            int num1 = leer.nextInt();
            suma += num1;
        } while (suma < num);
    }
}
