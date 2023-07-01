/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosExtras;

/**
 *
 * @author Ivan
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle
 * un valor diferente a cada una. A continuación, realizar las instrucciones
 * necesarias para que: B tome el valor de C, C tome el valor de A, A tome el
 * valor de D y D tome el valor de B. Mostrar los valores iniciales y los
 * valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int A, B, C, D;
        A = 10;
        B = 20;
        C = 30;
        D = 40;
        System.out.println("A=" + A + " B=" + B + " C=" + C + " D=" + D);
        int var1 = B;
        B = C;
        int var2 = C;
        C = A;
        int var3 = A;
        A = D;
        D = var1;

        System.out.println("A=" + A + " B=" + B + " C=" + C + " D=" + D);
    }
    
}
