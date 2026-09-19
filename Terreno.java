//Ejercisio 2: Area y Perimetro de un terreno
package Unidad1;

import java.util.Scanner;

public class Terreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("- Ejercisio 2 Area y Perimetro de Terreno --");
            
            System.out.print("Ingresa la base del terreno: ");
            int base = scanner.nextInt();
            
            System.out.print("Ingresa la altura del terreo: ");
            int altura = scanner.nextInt();
            
            int area = base * altura;
            int perimetro = 2 * (base + altura);
            
            System.out.println("El área del terreno es: " + area);
            System.out.println("El perímetro del terreno es: " + perimetro);

        } catch (Exception e) {
            System.out.println("Error: Debes ingresar únicamente numeros enteros.");
        } finally {
            scanner.close();
        }
    }
}