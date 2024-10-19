
package programas;

import java.util.Scanner;


public class Virgilio {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Mostra divisores de um número.");
        System.out.print("Número: ");
        int num = teclado.nextInt();
        
        while(num < 0){
            System.out.println("Número deve ser maior do que zero!");
            System.out.print("Número: ");
            num = teclado.nextInt();
        }            
        System.out.println("Divisores de " + num);
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            }
        }
        System.out.println("Fim do programa!");
        teclado.close();
    }
}

