package programas;
import java.util.Scanner;


public class EstruturaRepetitiva {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("----Soma Inteiros Pares----");
        int soma = 0;

        System.out.print("N�mero inteiro positivo, - negativo para sair: ");
        int num = entrada.nextInt();

        while(num >= 0){
            if(num % 2 == 0){
                soma = soma + num;
                System.out.println("Somou!");
            }
            System.out.print("N�mero Inteiro positivo, - negativo para sair: ");
            num = entrada.nextInt();
                
            } 
            System.out.print("Soma = " + soma);
            
            entrada.close();
        }
    }

