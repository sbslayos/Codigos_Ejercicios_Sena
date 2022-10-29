
package sena9;

import java.util.Scanner;

public class Sena9 {

    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un valor entre el 1 y el 10, para conocer su expresion en número romano");
        int number = sc.nextInt();
        
        switch (number){
            case 1:
                System.out.println(+number+" = I");
                break;
            case 2:
                System.out.println(+number+" = II");
                break;
            case 3:
                System.out.println(+number+" = III");
                break;    
            case 4:
                System.out.println(+number+" = IV");
                break;    
            case 5:
                System.out.println(+number+" = V");
                break;    
            case 6:
                System.out.println(+number+" = VI");
                break;  
            case 7:
                System.out.println(+number+" = VII");
                break;    
            case 8:
                System.out.println(+number+" = VIII");
                break;
            case 9:
                System.out.println(+number+" = IX");
                break;
            case 10:
                System.out.println(+number+" = X");
                break;
            default: 
                System.out.println("Debe digitar un valor entre el 1 y el 10");
        
     
        }
          
    }
    
}
