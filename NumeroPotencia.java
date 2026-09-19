package Unidad1;
import java.util.Scanner;

public class NumeroPotencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero, potencia, resultado;

        System.out.println("Ingresa un número:");
        numero = scanner.nextDouble();

        System.out.println("Ingresa la potencia:");
        potencia = scanner.nextDouble();

        resultado = Math.pow(numero, potencia);

        System.out.println("El resultado es: " + resultado);
    }
}    