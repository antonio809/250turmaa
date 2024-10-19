
package programas;
import java.util.Scanner;


public class ForArthur {
        public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            
            System.out.print("Insira um número inteiro: ");
            int num = entrada.nextInt();
            
            while(num <= 0){
                System.out.println("Número inválido!");
                System.out.println("Insira uma número positivo!");
                
                System.out.print("Informe um número inteiro: ");
                num = entrada.nextInt();
            }
            double soma = 0;
            System.out.println(" Informe " + num + " números ");
             
            for(int i = 1; i <= num ; i++){
             
                System.out.printf("Número %d: ", i );
                double num1 = entrada.nextDouble();
                soma = soma + num1;
                
            }
            System.out.println("fumiga 3.0: " + soma);
            System.out.println("Fim do programa.");
            entrada.close();
    }
}
