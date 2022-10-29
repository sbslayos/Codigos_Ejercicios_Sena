package sena14;

import java.util.Scanner;

public class Sena14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las 10 letras.");
        String cadena = sc.nextLine();

        int vocal_count = 0, consonant_count = 0;
        cadena = cadena.toLowerCase(); //Profe aqui convierto todos los carecteres en minusculas, 
        //No conocia esa función la saque de internet, tambien intente hacer el codigo con la funcion .equals() Pero me enrede.

        if (cadena.length() <= 10) {
            for (int i = 0; i < cadena.length(); i++) {

                char c = cadena.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocal_count++;

                } else {
                    consonant_count++;
                }

            }
            System.out.println("Se ingresarón: " + vocal_count + " vocales");
            System.out.println("Se ingresarón: " + consonant_count + " letras");

        } else if (cadena.length() > 10) {
            System.out.println("Debe ingresar solo 10 caracteres");
        }

    }

}
