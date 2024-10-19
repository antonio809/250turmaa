
package programas;
import java.util.Scanner;

public class Inteiros {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um numero: ");
        int num = entrada.nextInt();
        
        System.out.print("Insira outro numero: ");
        int num1 = entrada.nextInt();
        
        if(num > num1){
            System.out.println("Ele e maior.");
        }else{
            System.out.println("Ele nao e maior.");
        }
        entrada.close();
    }
    
}
