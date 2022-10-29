
package sena1;
import java.util.Scanner;


public class Sena1 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner sc = new Scanner(System.in);
   
   
   System.out.println("Señor Postulante, por favor ingrese el número de respuestas correctas \n"
                );
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    
    
    System.out.println("Señor Postulante, por favor ingrese el número de respuestas Incorrectas \n"
                );
    Scanner sca = new Scanner(System.in);
    int num2 = sca.nextInt();
    
    
    System.out.println("Señor Postulante, por favor ingrese el número de respuestas en blanco \n"
                );
    Scanner sc = new Scanner(System.in);
    int num3 = sc.nextInt();
    
    System.out.println("Señor postulante su puntaje final es " +(( num1*4)+(num2*-1)));
    }
    
}
