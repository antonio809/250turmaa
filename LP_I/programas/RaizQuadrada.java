
package programas;
import java.util.Scanner;


public class RaizQuadrada {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um numero: ");
        double n = entrada.nextDouble();
        
        double r = Math.sqrt(n);
        
        System.out.println("Raiz de " + n + " é: " + r);
        
        entrada.close();
    }
    
}
