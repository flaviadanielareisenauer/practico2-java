package Ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
    int diasDeViaje = 15; 
    double presupuestoMax = 250000.0;
    int comidas = diasDeViaje * 3; // 3 comidas diarias
    double gastoXComida = 0.8 * presupuestoMax / comidas; // tomamos el 80% (0.8) del presupuesto maximo dividiendolo entre el numero total de comidas.
        
    System.out.println("Puedes gastar " + gastoXComida + " en cada comida para que te alcance la plata durante los " + diasDeViaje + " días de viaje.");
    }
}