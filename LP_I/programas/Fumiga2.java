package programas;

import java.util.Scanner;

public class Fumiga2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um número inteiro - negativo para sair: ");
        int num = entrada.nextInt();

        while (num >= 0) {

            System.out.printf("Tabuada de %d\n", num);

            for (int i = 0; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", num, i, num * i);
            }

            System.out.println("Insira um número inteiro - negativo para sair: ");
            num = entrada.nextInt();
        }
        System.out.println("Fim do programa!");
        entrada.close();

    }
}
