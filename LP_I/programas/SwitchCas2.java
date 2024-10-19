
package programas;
import java.util.Scanner;

public class SwitchCas2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double num1, num2, resultado;
        char operacao;
        
        System.out.print("Número 1: ");
        num1 =  entrada.nextDouble();
        
        System.out.print("Operação [+, -, *, /]: ");
        operacao = entrada.next().charAt(0);
        
        System.out.print("Número 2: ");
        num2 = entrada.nextDouble();
        
        switch(operacao){
            case '+':
                resultado = num1 + num2;
                System.out.println("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.println("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.println("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.println("Resultado: " + num1 + " / " + num2 + " = " + resultado);
                break;
            default:
                System.out.println("Operação não compreendida.");
              
        }
        entrada.close();
    }
}
