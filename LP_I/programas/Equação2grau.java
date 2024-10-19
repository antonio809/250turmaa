
package programas;
import java.util.Scanner;


public class Equação2grau {
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Valor de a: ");
        double a = entrada.nextDouble();
        
        System.out.print("Valor de b: ");
        double b = entrada.nextDouble();
        
        System.out.print("Valor de c: ");
        double c = entrada.nextDouble();
        
        double delta = Math.pow(b, 2) - 4*a*c;
        
        double x1, x2;
        
        if(delta < 0){
            System.out.println("N�o possui ra�z real.");
        }
        if(delta == 0){
            x1 = -b / 2 * a;
            System.out.println("Possui 1 ra�z real.");
            System.out.println("x = " + x1);
        }
        if(delta > 0){
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);   
        }
        entrada.close();
    }
}
