
package programas;
import java.util.Scanner;


public class AtribuicaoCumulativa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int minutos;
        double vlrConta = 50.0;
        
        System.out.println("Valor a pagar.");
        System.out.print("Quantidade de minutos: ");
        minutos = entrada.nextInt();
        
        if(minutos > 100){
            // vlrPagar = vlrPagar + (minutos - 100) * 2.0;
            vlrConta += (minutos - 100)* 2.0;
        }
        System.out.printf("Valor da conta r$ %.2f%n" , vlrConta);
        entrada.close();
    }
}
