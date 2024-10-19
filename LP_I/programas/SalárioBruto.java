
package programas;
import java.util.Scanner;

public class SalárioBruto {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Salario Bruto =  ");
        double salBruto = entrada.nextDouble();
        
        System.out.print("Prestacao = ");
        double prestacao = entrada.nextDouble();
        
        double vlrMax = 30.0/100.0 * salBruto;
        
        if(prestacao <= vlrMax){
            System.out.println("emprestimo concedido!");
            
        }else{
            System.out.println("Emprestimo nao concedido!");
        }
        
        
        entrada.close();
    }
}
