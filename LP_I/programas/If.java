package programas;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("a =  ");
        double a = entrada.nextDouble();

        System.out.print("b =  ");
        double b = entrada.nextDouble();

        System.out.print("c =  ");
        double c = entrada.nextDouble();

        double delta = b * b - 4 * a * c;

        System.out.println("Delta = " + delta);
        if (delta < 0) {
            System.out.println("Não existe raiz real!");
        } else if (delta == 0) {
            System.out.println("Apenas uma raiz real!");
            double x = -b / 2 * a;
            System.out.println("x = " + x);
        } else {
            System.out.println("Duas raízes reais!");

            double x1 = (-b + Math.sqrt(delta)) / 2 * a;
            double x2 = (-b - Math.sqrt(delta)) / 2 * a;

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

        entrada.close();
    }
}
