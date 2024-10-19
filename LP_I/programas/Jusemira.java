package programas;

import java.util.Scanner;

public class Jusemira {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num = (int) (Math.random() * 1000);
        int qtdTentativas = 0;
        int chute = 0;

        System.out.println("Adivinhe o número gerado pelo computador!");
        do {
            System.out.println("Chute: ");
            chute = entrada.nextInt();

            if (chute > num) {
                System.out.println("Seu chute foi maior do que o número!");
                qtdTentativas++;
            }

            if (chute < num) {
                System.out.println("Seu chute foi menor do que o número!");
                qtdTentativas++;
            }

        } while (chute != num);
        
        if(qtdTentativas == 0){
            qtdTentativas = 1;
        }
        System.out.println("Fim do Programa!");
        System.out.printf("Acertou com %d tentativas\n", qtdTentativas);

        entrada.close();
    }
}
