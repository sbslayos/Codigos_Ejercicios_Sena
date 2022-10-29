
package sena13;

public class Sena13 {

    
    public static void main(String[] args) {
        
        int limit = 26, a = 0, b = 1, acum;
        
        
        
        for (int i =0; i < limit; i++){
            System.out.println(a);
            acum = a + b;
            a = b;
            b = acum;
        
        }
        
    }
    
}
