
package programas;
import java.util.Scanner;

public class MaiorDele {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um número inteiro: ");
        int num = entrada.nextInt();
        
        System.out.print("Insira outro número inteiro: ");
        int num1 = entrada.nextInt();
        
        if(num == num1){
            System.out.println("Os Números são Iguais!"); 
        }else if(num > num1){
            System.out.println("Resultado: " + (num-num1));
        }else{
            System.out.println("Resultado: " + (num1 - num));
        }
        entrada.close();
    }
}
