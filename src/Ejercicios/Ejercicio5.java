/*
Calculador de abastecimiento de por vida
Ejercicio 5: ¿Cuántos snacks vas a comer por el resto de tu vida? ¡Averigualo!
1. Almacená tu edad en una variable.
2. Guardá tu edad máxima en otra variable.
3. Declará una variable con el nombre de tu snack favorito.
4. Estimá cuántos snacks vas a comer por día y guardalo como un número en una variable.
5. Calculá cuántos snacks te quedan por comer en el resto de tu vida.
6. Mostrá en la consola el resultado: "Vas a necesitar NN snacks para que te alcancen hasta los XX años.".
7. Agregale un precio por unidad y descubrí cuánto vas a gastar en snacks el resto de tu vida.
*/

package Ejercicios;

public class Ejercicio5 {
    public static void main(String[] args) {
        int miEdad = 33, edadMax = 85;              
        String snackFavorito = "papas fritas";
        int porDia = 2;
        
        int añosRestantes = edadMax - miEdad;
        int snacksRestantes = añosRestantes * 365 * porDia;
        
        System.out.println("Vas a necesitar " + snacksRestantes + " " + snackFavorito + " para que te alcancen hasta los " + edadMax + " años." );
        
        double precioXUnidad = 1.5;
        double total = snacksRestantes * precioXUnidad;
        
        System.out.println("Vas a gastar $" + total + " en " + snackFavorito + " el resto de tuvida.");        
    }    
}
