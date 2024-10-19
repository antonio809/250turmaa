package programas;
import java.util.Scanner;

public class Aula09103 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);


        System.out.println("Insira 5 números: ");
        double v[] = new double[5];
        double soma = 0;
        double media = 0;
        

        for(int i = 0; i < 5; i++){
            System.out.print("v[" + (i+1) + "] : ");
            v[i] = entrada.nextDouble();

            soma = soma + v[i];
            media = soma / 5;
        }

        System.out.println("Soma dos números: " + soma);
        System.out.println("Média: " + media);

        System.out.println("Novo Vetor: ");
        for(int i = 0; i < 5; i++){
            System.out.print("v[" + (i+1) + "] : ");
            v[i] = 2 * v[i];
            System.out.println(v[i]);
        }
        System.out.println("Na Ordem Inversa: ");
        for(int i = 4; i >=0; --i){
            System.out.println("v[" + (i-1) + "] : " + v[i]);
            
        }
        
        

        entrada.close();
    }
}
