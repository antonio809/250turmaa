package programas;

import java.util.Scanner;

public class Aula16101 {
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe 7 números:");
        double numeros[] = new double[7];

        for(int i = 0; i < 7; i++){
            System.out.print((i + 1) + "o. número: ");
            numeros[i] = entrada.nextDouble();
        }

        System.out.print("Número buscado: ");
        double busca = entrada.nextDouble();

        boolean naoTemBusca = true;

        for(int i = 0; i < 7; i++){
            if(busca == numeros[i]){
                System.out.println("Número existe");
                System.out.println("Posição: " + (i + 1));
                naoTemBusca = false;
            }
        }
        if(naoTemBusca){
            System.out.println("Não existe o número que você buscou.");
        }

        System.out.println("Fim do programa\nBye bye.");
    }
}
