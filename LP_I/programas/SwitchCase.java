
package programas;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Alimento não-perecível");
        System.out.println("2 - Alimento perecível");
        System.out.println("3 - Vestuário");
        System.out.println("4 - Limpeza");
        System.out.println("5 - Fim");
        System.out.print("=> ");
        
        int opcao = entrada.nextInt();
        
        switch(opcao){
            case 1:
                System.out.println("Alimento não-perecível");
                break;
            case 2:
                System.out.println("Alimento perecível");
                break;
            case 3: 
                System.out.println("Vestuário");
                break;
            case 4:
                System.out.println("Limpeza");
                break;
            default:
                System.out.println("Produto não Cadastrado.");
                break;
        }
        entrada.close();
    }
}
