package sena_ciclico_1;
import java.util.Scanner;
public class Sena_Ciclico_1 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite su año de nacimiento.");
        int year = sc.nextInt();
        int result;
        int yearActually = 2023;
        
        if( year <= yearActually ){
             result = ( yearActually - year);
             System.out.println("Su edad actual en años es  de: " +result );
        }else {
            System.out.println("El año ingresado no es valido");
              }
}
}
    
 //Algoritmo que a partir de una fecha de nacimiento y una fecha actual determine la edad en años actual de 
//una persona.