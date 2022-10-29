
package sena5;

import java.util.Scanner;


public class Sena5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la edad del primer hermano, para hacer la respectiva verificación.");
        int edad_1 = sc.nextInt();
        
        System.out.println("Ingrese la edad del segundo hermano, para hacer la respectiva verificación.");
        int edad_2 = sc.nextInt();
        
        if ( edad_1 > edad_2){
            int i = edad_1 - edad_2;
            System.out.println("El hermano mayor tiene "+edad_1+" años, y la diferecia de edad es de "+i+" años.");
        }
        if ( edad_2 > edad_1 ){
            int i = edad_2 - edad_1;
            System.out.println("El hermano mayor tiene "+edad_2+" años, y la diferecia de edad es de "+i+" años.");
        }
        if ( edad_1 == edad_2 ){
            System.out.println("Los hermanos tienen la misma edad.");
        }   
    }
    
}
