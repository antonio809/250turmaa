
package programas;
import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um numero: ");
        int num = entrada.nextInt();
        
        if(num%5 == 0){
            System.out.println("Isso e um multiplo de 5");
        }
        else {
            System.out.println("Não e um multiplo de 5");
        }

        entrada.close();
    }
}
