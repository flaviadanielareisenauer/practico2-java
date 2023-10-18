/*
Ejercicio 3: Calculadora de edad
1. Creá distintas variables con edades de 2 usuarios. Ingresá por teclado los valores de las
edades.
2. Calculá la cantidad de días que tienen esos años.
3. Mostrá la respuesta en la consola.
*/

package Ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Objeto Scanner para ingresar edades por teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la edad del primer usuario: ");
        int usuario1 = scanner.nextInt(); // Pra leer lo que se ingresa por consola
        
        System.out.println("Ingrese la edad del segundo usuario:");
        int usuario2 = scanner.nextInt();
        
        // Calcula la cantidad de dias que tienen esos años
        int diasUsuario1 = usuario1 * 365;
        int diasUsuario2 = usuario2 * 365;
        
        System.out.println("El primer usuario tiene " + diasUsuario1 + " dias de edad.");
        System.out.println("El segundo usuario tiene " + diasUsuario2 + " dias de edad.");
        
        scanner.close();
    }    
}
