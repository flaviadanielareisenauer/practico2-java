package Ejercicios;

public class Ejercicio7 {
    public static void main(String[] args) {
        // Paciente 1 y las variables con sus datos
        String nombre1 = "Nicolas";
        String apellido1 = "Lopez";
        int edad1 = 27;
        double peso1 = 83.5;
        double altura1 = 170.0;
        boolean tienePrepaga1 = true;

        double imc1 = peso1 / (altura1 / 100.0 * altura1 / 100.0); // su IMC

        System.out.println(nombre1 + " " + apellido1 + " tiene " + edad1 + " años y su índice de masa corporal es de " + imc1);

        // Paciente 2 y las variables con sus datos
        String nombre2 = "Esteban";
        String apellido2 = "Piazza";
        int edad2 = 28;
        double peso2 = 80.1;
        double altura2 = 176.0;
        boolean tienePrepaga2 = true;

        double imc2 = peso2 / (altura2 / 100.0 * altura2 / 100.0); // su IMC

        System.out.println(nombre2 + " " + apellido2 + " tiene " + edad2 + " años y su índice de masa corporal es de " + imc2);

        // Paciente 3 y las variables con sus datos
        String nombre3 = "Jose";
        String apellido3 = "Fermoso";
        int edad3 = 33;
        double peso3 = 63.7;
        double altura3 = 153.0;
        boolean tienePrepaga3 = false;

        double imc3 = peso3 / (altura3 / 100.0 * altura3 / 100.0); // su IMC

        System.out.println(nombre3 + " " + apellido3 + " tiene " + edad3 + " años y su índice de masa corporal es de " + imc3);

        // Paciente 4 y las variables con sus datos
        String nombre4 = "Juan";
        String apellido4 = "Fernandez";
        int edad4 = 26;
        double peso4 = 55.0;
        double altura4 = 162.0;
        boolean tienePrepaga4 = true;

        double imc4 = peso4 / (altura4 / 100.0 * altura4 / 100.0); // su IMC

        System.out.println(nombre4 + " " + apellido4 + " tiene " + edad4 + " años y su índice de masa corporal es de " + imc4);
    }
}