
package sena4;

import java.util.Scanner;

public class Sena4 {

  
    public static void main(String[] args) {
        
        int cuil;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite su año de nacimiento para la respectiva verificacion del certificado CUIL ");
        int fecha = sc.nextInt();
        
        if ( fecha < 2005 ){
            System.out.println("Usted esta habilitado para sacar su CUIL");      
             }
        if ( fecha >= 2005 ){
            System.out.println("Usted no esta habilitado para sacar el CUIL, porque \n no ha cumplido la mayoria de edad que requiere la Republica Argentina");
            }
        }
    
    }
    

