
package programas;
import java.util.Scanner;


public class OutroExercicio {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.print("Insira um numero: ");
        num1 = entrada.nextInt();
        
        System.out.print("Insira outro numero: ");
        num2 = entrada.nextInt();
        
        if(num1 > num2){
            System.out.println("O primeiro e maior.");
        }else{
            System.out.println("O segundo e maior.");
        }
        
        entrada.close();
    }
    
}
