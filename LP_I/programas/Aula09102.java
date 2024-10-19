package programas;
import java.util.Scanner;

public class Aula09102 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira 5 números: ");
        double v[] = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("v[" + (i+1) + "] : ");
            v[i] = entrada.nextDouble();

            soma = soma + v[i];

        }
        
        System.out.println("Soma dos números: " + soma);
        System.out.println("Números em ordem invertida: ");
        
        for(int i = 4; i >= 0; i--){
            System.out.println("número: " + (i+1) + " = " + v[i]);
            
        }

    }
}
