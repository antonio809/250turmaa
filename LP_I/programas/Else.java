
package programas;
import java.util.Scanner;

public class Else {
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um numero: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Insira outro numero: ");
        double num2 = entrada.nextDouble();
        
        double media = (num1*num2)/2;
        
        if(media < 6){
            System.out.println("Voce esta de recuperacao.");
        }else{
            System.out.println("Esquece! Tu e bom.");
        }

        entrada.close();
    }
    
}
