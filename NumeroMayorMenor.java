//Ejercisio 3: Numero Mayor o Menor a 0
package Unidad1;
import java.util.Scanner;

public class NumeroMayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingresa un número entero:");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("El número es igual a Cero (0).");
            } else if (numero > 1) {
                System.out.println("El número es mayor a 1.");
            } else if (numero < 1) {
                System.out.println("El número es menor que 1.");
            }
        } catch (Exception e) {
                System.out.println("Error: Debes ingresar un número entero válido.");
        }
    }
}
