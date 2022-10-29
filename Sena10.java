
package sena10;

import java.util.Scanner;

public class Sena10 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese un número del 1 al 5 para conocer la relacion con la vocal.");
        int number = sc.nextInt();
        
        switch(number){
            
            case 1:
                System.out.println("a = "+number);
                break;
            case 2:
                System.out.println("e = "+number);
                break;
            case 3:
                System.out.println("i = "+number);
                break;
            case 4:
                System.out.println("o = "+number);
                break;
            case 5:
                System.out.println("u = "+number);
                break;
            default:
                System.out.println("Debe ingresar un valor, entre 1 y 5");
        
        } 
       
    }
    
}
