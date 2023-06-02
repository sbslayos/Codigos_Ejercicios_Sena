package sena_ciclico_2;
import java.util.Scanner;

public class Sena_Ciclico_2 {

    public static void main(String[] args) {
        Scanner chicharron = new Scanner (System.in);
        System.out.println("Ingrese un año para saber si el mismo es bisiesto");
        int year = chicharron.nextInt();
        
        if ( year % 4 == 0 ){
            System.out.println("El año; "+year+ " es un año bisiesto");
        } else {
            System.out.println("El año ingresado no es un año bisiesto");
        }
    }
}
