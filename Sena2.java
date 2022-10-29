
package sena2;
import java.util.Scanner;


public class Sena2 {
    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
        System.out.println("Ingrese la cantidad de partidos ganados");
        int ganados = input.nextInt();
        
        System.out.println("Ingrese el total de partidos empatados");
        int empate = input.nextInt();
        
        System.out.println("Ingrese el total de partidos perdidos");
        int perdidos = input.nextInt();
        
        int puntaje_Total = (ganados * 3)+(empate * 1)+(perdidos * 0);
        
        System.out.println("El puntaje Obtenido por el equipo en el torneo de apertura es de "+puntaje_Total+" puntos.");
        
    }
    
}
