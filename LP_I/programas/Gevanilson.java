package programas;

import java.util.Scanner;

public class Gevanilson {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char opcao;

        do {
            System.out.print("Temperatura em Celsius: ");
            double tc = entrada.nextDouble();

            double tf = 9 * tc / 5 + 32;

            System.out.printf("Temperatura em Fahrenheit: %.1f\n", tf);
            System.out.print("Deseja continuar (s/n): ");
            opcao = entrada.next().charAt(0);
            
        } while (opcao == 's' || opcao == 'S');
        System.out.println("Fim do programa!");
        System.out.println("Bye Bye mohres!");
        entrada.close();
    }
}
