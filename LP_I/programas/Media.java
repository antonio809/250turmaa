
package programas;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("nota 1: ");
        double n1 = entrada.nextDouble();
        
        System.out.print("nota 2: ");
        double n2 = entrada.nextDouble();
        
        System.out.print("nota 3: ");
        double n3 = entrada.nextDouble();
       
        
        double media = (n1+n2+n3)/3;
        
        if(media > 0.0 && media < 3.0){
            System.out.println("Reprovado.");
        }
        if(media >= 3.0 && media < 6.0){
            System.out.println("Recuperacao.");
        }
        if(media >= 6.0 && media <= 10){
            System.out.println("Aprovado.");
        }
        
        entrada.close();
    }
    
}
