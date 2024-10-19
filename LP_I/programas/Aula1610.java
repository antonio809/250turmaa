package programas;
import java.util.Scanner;

public class Aula1610 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int qtd = 0;

        do{
            System.out.print("Quantos números você vai digitar? ");
            qtd = entrada.nextInt();
        }while(qtd <= 0 || qtd > 10);

        int numeros[] = new int[qtd];
        
        for(int i = 0; i < qtd; i++){
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        System.out.println();
        System.out.println("Números negativos: ");

        boolean temSohpositivo = true;

        for(int i = 0; i < qtd; i++){
            if(numeros[i] < 0){
                System.out.println("Número " + (i+1) + ": " + numeros[i]);
                temSohpositivo = false;
            }
        }
        
        if(temSohpositivo){
            System.out.println("Não há!");
        }
        System.out.println();
        System.out.println("Fim do programa!");
        entrada.close();
    }   
}
