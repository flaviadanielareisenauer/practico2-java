/*
Ejercicio 1: Variables numéricas
1. Declará una variable llamada uno y asignale un número cualquiera.
2. Declará una variable llamada dos y asignale como valor la variable uno.
3. Cambiá el valor de la variable uno.
Pensá antes de ver el resultado: ¿cuál es el valor de la variable dos?
*/

package Ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        int uno = 11;
        int dos = uno;
        
        uno = 27;
        
        System.out.println("Valor de uno: " + uno);
        System.out.println("Valor de dos: " + dos);
    }    
}
