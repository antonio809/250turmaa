package programas;

import java.util.Scanner;

public class QualquerCoisa {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("diga um número: ");
        int num1 = entrada.nextInt();

        System.out.println("diga outro número: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("Você é chato para um caralho.");
        }else{
            System.out.println("Continua sendo chato pra caralho!");
        }

        entrada.close();
    }
}
