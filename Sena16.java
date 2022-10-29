
package sena16;


public class Sena16 {

   
    public static void main(String[] args) {
        
        int matriz[][] = new int [5][6];
        
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                 matriz[x][y] = (int) (Math.random()*9+1);
                System.out.println (matriz[x][y]);
            }
        }
        for ( int i=0; i < matriz.length; i++){
            for ( int g=0; g< 5; g++){
                for ( int r=0; i<6 ; i++  ){
                    for ( int h=0; h < 6 ;h++){
                        if (matriz[i][g] >= matriz[r][h]){
                            matriz[i][g] = matriz[i][g];
                        
                        }else{
                        int temp = matriz [r][h];
                        matriz[r][h]=matriz[i][g];
                        matriz[i][g]=temp;
                        
                        }
                    }
                }
            }
        }
        for ( int i=0 ; i<5; i++){
            for (int g=0; g<6; g++){
                System.out.print(matriz[i][g]+"\t");  
                
            }
            System.out.println(" ");
        }
              
    }
    
}
