
package programas;

import java.util.Scanner;


public class NumerosInteiros {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("n1 = ");
        int n1 = entrada.nextInt();
        
        System.out.print("n2 = ");
        int n2 = entrada.nextInt();
        
        if(n1 > n2){
            System.out.println("O primeiro é maior do que o segundo.");
            
            if(n1%2 == 0){
                System.out.println("O numero é par.");
            }else{
                System.out.println("O numero é par.");
            }
        }else{
            System.out.println("O segundo é maior do que o primeiro");
            if(n2%2 == 0){
                System.out.println("O numero é par.");
               
            }else{
                System.out.println("O numero é impar.");
            }
        }

        entrada.close();
    }
     
}
