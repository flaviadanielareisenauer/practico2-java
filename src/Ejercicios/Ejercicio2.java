/*
Ejercicio 2: Mensaje con variables
4. Declará las siguientes variables y asignales un valor:
a. 'nombre'
b. 'edad'
c. 'cumpleaños'
d. 'ciudad'
e. 'ocupacion'
f. 'hobbie'
5. Usá System.out.println() para escribir un párrafo que combine strings con la información
guardada en las variables.
6. Desafío Bonus: creá múltiples variables en una única línea de código.
*/


package Ejercicios;

public class Ejercicio2 {
    public static void main(String[] args) {
        String nombre = "Flavia", cumpleaños = "07 de enero", ciudad = "Crespo", ocupacion = "Administrativa", hobbie = "leer";
        int edad = 33;

        
        System.out.println("Hola, me llamo " + nombre);
        System.out.println("Tengo " + edad + " años y mi cumpleaños es el " + cumpleaños);
        System.out.println("Vivo en la ciudad de " + ciudad + " trabajo actualmente como " + ocupacion);
        System.out.println("En mi tiempo libre, me gusta " + hobbie);
    }    
}
