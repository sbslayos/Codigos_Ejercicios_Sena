
package sena7;
import java.util.Scanner;


public class Sena7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, digite el primero numero.");
        int one_Num = sc.nextInt();
        
          System.out.println("Por favor, digite el segundo numero.");
        int second_Num = sc.nextInt();
        
          System.out.println("Por favor, digite el tercer numero.");
        int three_Num = sc.nextInt();
        
        
        if ( one_Num > second_Num  && one_Num > three_Num)  {
            System.out.println("El primer número ingresado: "+one_Num+" es el mayor de los 3 ingresados. ");
        }else {
            if ( second_Num > one_Num && second_Num > three_Num ) {
                System.out.println("El segundo número ingresado: "+second_Num+" es el mayor de los 3 ingresados.");
            }else{
                if( three_Num > one_Num && three_Num > second_Num ){
                    System.out.println("El tercer número ingresado: "+three_Num+" es el mayor de los 3 ingresados.");
                }else{
                    if( one_Num == second_Num || one_Num == three_Num || second_Num == three_Num ){
                        System.out.println("Hay valores repetidos");
                    }
                }
            }
        }
           
    }
    
}
