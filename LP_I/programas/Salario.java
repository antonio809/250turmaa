
package programas;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o Salário Atual: ");
        double salarioAtual = entrada.nextDouble();
        
        System.out.print("Digite a porcentagem do reajuste: ");
        double porcentagemReajuste = entrada.nextDouble();
        
        double valorReajuste = salarioAtual * (porcentagemReajuste / 100);
        
        double novoSalario = salarioAtual + valorReajuste;
        
        System.out.printf("O novo salário é: %2f/n" , novoSalario);
        
        entrada.close();
    }
}
