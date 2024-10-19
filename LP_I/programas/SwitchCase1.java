
package programas;
import java.util.Scanner;


public class SwitchCase1 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double num1 = entrada.nextDouble();
        
        System.out.print("Digite a operação: ");
        char operacao = entrada.next().charAt(0);
        //entrada.nextLine();
        
        System.out.print("Digite outro número: ");
        double num2 = entrada.nextDouble();
        
        double resultado;
        
        switch(operacao){
            case '+':
                resultado = num1 + num2;
                System.out.print("Resultado: " + num1 + " + " + num2 + " = " + resultado);
                break;
            case '-':
                resultado = num1 - num2;
                System.out.print("Resultado: " + num1 + " - " + num2 + " = " + resultado);
                break;
            case '*':
                resultado = num1 * num2;
                System.out.print("Resultado: " + num1 + " * " + num2 + " = " + resultado);
                break;
            case '/':
                resultado = num1 / num2;
                System.out.print("Resultado: " + num1 + " / " + num2 + " = " + resultado);
            default:
                System.out.println("Operação Inválida.");
                break;
        }
        entrada.close();
    }  
}
