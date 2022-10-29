package sena15;

import java.io.Console;
import java.util.Scanner;

public class Sena15 {

    public static void main(String[] args) {

        double c0;
        double c1;
        double c2;
        double c3;
        double g;
        double k;

        // Elaborar   un algoritmo   para   obtener   el   resultado   del   escrutinio   en   las elecciones del delegado del colegio, 
        // hay que considerar que hay 160 electores y se han presentado 3 candidatos, todos votaron, 
        // el algoritmo debe de declarar al ganador por mayoría simple.
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c0 = 0;
        g = 0;
        Scanner sc = new Scanner(System.in);

        for (k = 1; k <= 10; k++) {

            System.out.println("Ingrese el voto del elector: ");
            int ve = sc.nextInt();

            switch (ve) {
                case 1:
                    c1 = c1 + 1;
                    break;
                case 2:
                    c2 = c2 + 1;
                    break;
                case 3:
                    c3 = c3 + 1;
                    break;
                default:
                    c0 = c0 + 1;
                    break;
            }
        }
        if ((c1 > c3) && (c2 > c3) && (c1 > c0)) {
            g = c1;
            if ((c2 > c3) && (c2 > c0)) {
                g = c2;
            }
            if ((c3 > c0)) {
                g = c3;
            } else {
                g = c0;
            }
        }
        System.out.println(g);
    }

}
