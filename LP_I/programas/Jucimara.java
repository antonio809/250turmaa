
package programas;
import java.util.Scanner;

public class Jucimara {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um número inteiro: ");
        int num = entrada.nextInt();
        
        while(num <= 0){
            System.out.println("Valor inválido. Número Inválido.");
            System.out.print("Insira um número inteiro: ");
            num = entrada.nextInt();
        }
        System.out.println("Contagem Regressiva");
        for(int i = num; i >= 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("BOOOOOOMMMMMM");
        entrada.close();
    }
}
