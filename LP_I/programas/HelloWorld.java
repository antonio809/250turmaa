
package programas;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um n�mero inteiro: ");
        int n1 = entrada.nextInt();
        
        System.out.print("Insira um n�mero inteiro: ");
        int n2 = entrada.nextInt();
        
        System.out.print("Insira um n�mero inteiro: ");
        int n3 = entrada.nextInt();
        
        if(n1 > n2 && n1 > n3){
            System.out.println("O primeiro n�mero � maior.");
        }else if(n2 > n1 && n2 > n3){
            System.out.println("O segundo n�mero � maior.");
        }else{
            System.out.println("O terceiro n�mero � maior.");
        }

        entrada.close();
    }
}
