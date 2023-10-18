/*
Ejercicio 6: Estás organizando tus vacaciones y tenés que calcular cuánto dinero vas a necesitar para la comida.
1. Almacená la cantidad de días que vas a estar de viaje en una variable.
2. Estimá tu presupuesto máximo por todo el viaje y guardalo en una variable.
3. Estima cuántas comidas vas a tener en todo tu viaje. Guardá este valor en una variable.
4. Teniendo en cuenta tu presupuesto máximo, calculá cuánto podés gastar en cada comida, siendo que pensás destinar el 80% del presupuesto en comida.
5. Mostrá la consola el resultado: "Podés gastar XX en cada comida para que te alcance la plata durante los XX días de viaje".
*/

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
