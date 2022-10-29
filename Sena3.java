
package sena3;
import java.util.Scanner;


public class Sena3 {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la capacidad del disco duro, expresada en Gygabites");
        int disco_Duro = sc.nextInt();
        
        int n = (disco_Duro * 1024);
        System.out.println("Tamaño del disco duro en megabytes "+(n));
        int cd = (n/700+1);
        System.out.println("Para realizar la copia de seguridad del disco duro, es necesario usar "+cd+" CD'S Virgenes.");
        
    }
    
}
