
package sena6;

import java.util.Scanner;

public class Sena6 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Señor Operario, por favor ingrese la produccion semanal expresada en unidades.");
        int unidades = sc.nextInt();
        
        if ( unidades / 6 >= 100 ){
            System.out.println("El operario recibira incentivo ya que, supero el promedio de producción minima.");
        } else{
        System.out.println("El operario no recibira incentivos."); 
        }
    }
    
}
