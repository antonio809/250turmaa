
package programas;
import java.util.Scanner;


public class Munn {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um n�mero: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Insira outro n�mero: ");
        int num2 = entrada.nextInt();
        
       if(num1 > num2){
           System.out.println("O primeiro n�mero � maior.");
       }else{
           System.out.println("O segundo n�mero � maior.");
       }

       entrada.close();
    }
}
