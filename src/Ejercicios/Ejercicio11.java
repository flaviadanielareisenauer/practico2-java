package Ejercicios;
import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de X: ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el valor de Y: ");
        int y = scanner.nextInt();

        if (y != 0) {
            double resultado = (double) x / y;

            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("División imposible");
        }

        scanner.close();
    }
}