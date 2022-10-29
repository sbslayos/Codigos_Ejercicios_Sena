
package sena8;

import java.util.Scanner;

public class Sena8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese, el primer lado del triangulo.");
        int lado_1 = sc.nextInt();
        System.out.println("Por favor ingrese, el segundo lado del triangulo.");
        int lado_2 = sc.nextInt();
        System.out.println("Por favor ingrese, el tercer lado del triangulo.");
        int lado_3 = sc.nextInt();
        
        if ( lado_1 == lado_2 && lado_1 == lado_3 && lado_2 == lado_3 ){
            System.out.println("Sus tres lados son iguales, es un triangulo EQUILATERO");
        }else{
            if ( lado_1 == lado_2 || lado_2 == lado_3 || lado_1 == lado_3 ){
            System.out.println("Dos de sus lados son iguales, es un triangulo ISÓSCELES");
        }else{
        
            System.out.println("Sus tres lados son distintos, es un triaungulo ESCALENO");
                
            }
        }   
    }
    
}
