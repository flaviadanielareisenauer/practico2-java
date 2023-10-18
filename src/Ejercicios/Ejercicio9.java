/*
Ejercicio 9: Crear la condición que exprese los siguientes enunciados:
1. Para subir a una montaña rusa la edad debe ser mayor a 12 años y la altura debe ser mayor a 1,30 m.
2. Un código es válido si se trata de un número entero de 3 dígitos y capicúa.
3. Un estudiante pasa de nivel si su nota es mayor a 7 en sus dos evaluaciones parciales, o si obtiene un 4 en el examen final.
4. Dejamos ver la TV a nuestro hijo si realizó la tarea pero además, si tocó sus prácticas de piano y lo hizo de memoria.
*/

package Ejercicios;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Para subir a una montaña rusa la edad debe ser mayor a 12 años y la altura debe ser mayor a 1.30m.
        int edad = 15;
        double altura = 1.60;
        
        if (edad > 12 && altura > 1.30) {
            System.out.println("Puede subir a la montaña rusa.");
        } else {
            System.out.println("No puede subir a la montaña rusa.");       
        }
        
        
        // Un codigo es valido si se trata de un numero entero de 3 digitos y capicua. 
        int codigoValido = 696;
        
        if (codigoValido >= 100 && codigoValido <= 999) { 
            int primerDigito = codigoValido % 10;
            int segundoDigito = (codigoValido / 10) % 10;
            int tercerDigito = (codigoValido / 100) % 10;
            
            if (primerDigito == tercerDigito) {
                System.out.println("El codigo es valido y capicua.");
            } else {
                System.out.println("El codigo es valido pero no es capicula.");
            } 
        }else {
            System.out.println("El codigo no es valido.");
        }
        
        
        // Un estudiante pasa de nivel si su nota es mayor a 7 en sus dos evaluaciones parciales, o si obtiene un 4 en el examen final. 
        int notaDeParcial1 = 7, notaDeParcial2 = 9, examenFinal = 4;
        
        if((notaDeParcial1 > 7 && notaDeParcial2 > 7) || examenFinal >= 4){
            System.out.println("El estudiante pasa de nivel.");
        } else {
            System.out.println("El estudiante no pasa de nivel.");        
        }
        
        
        // Dejamos ver la TV a nuestro hijo si realizo la tarea pero ademas, si toco sus practicas de piano y lo hizo de memoria. 
        boolean realizoLaTarea = false, practicoPiano = true, deMemoria = true;
        
        if(realizoLaTarea && (practicoPiano && deMemoria)) {
            System.out.println("Puedes ver la TV.");
        } else {
            System.out.println("No puedes ver la TV.");
        }        
    }    
}
