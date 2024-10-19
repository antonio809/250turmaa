
package programas;

import java.util.Scanner;


public class EstruturasRele {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Divis�o de dois n�meros: ");
        System.out.print("Primeiro N�mero: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Segundo N�mero: ");
        double num2 = entrada.nextDouble();
        
        
        while(num2 == 0){
            System.out.println("Segundo N�mero deve ser positivo!");
            
            System.out.print("Segundo N�mero: ");
            num2 = entrada.nextDouble();
        }
        double resultado = num1 / num2;
        System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);


        entrada.close();
    }
}
