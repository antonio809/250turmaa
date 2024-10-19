
package programas;
import java.util.Scanner;


public class Comparacoes {
    public static void main(String []args){
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Insira um numero inteiro: ");
    int n1 = entrada.nextInt();
    System.out.print("Insira outro numero inteiro: ");
    int n2 = entrada.nextInt();
    
        System.out.println();
        System.out.println("Comparacoes");
        System.out.println("n1 == n2: " + (n1 == n2));
        System.out.println("n1 != n2: " + (n1 != n2));
        System.out.println("n1 > n2: " + (n1 > n2));
        System.out.println("n1 < n2: " + (n1 < n2));
        System.out.println("n1 >= n2: " + (n1 >= n2));
        System.out.println("n1 <= n2: " + (n1 <= n2));
    
    
        entrada.close();
    }
}
