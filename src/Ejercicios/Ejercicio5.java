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