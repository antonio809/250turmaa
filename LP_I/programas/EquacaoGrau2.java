
package programas;
import java.util.Scanner;

public class EquacaoGrau2 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
       double a, b, c;
       double delta;
       double x_1, x_2;
       
        System.out.println("Entre com os coeficientes: ");
        
        System.out.print("a (!=0) = ");
        a = entrada.nextDouble();
        
        System.out.print("b = ");
        b = entrada.nextDouble();
        
        System.out.print("c = ");
        c = entrada.nextDouble();
      
        delta = Math.pow(b, 2) - 4*a*c;
        
        if(delta < 0){
            System.out.println("Nao possui raizes reais.");
        }else if(delta == 0){
            x_1 = -b / 2*a;
            System.out.println("Possui uma raiz real.");
            System.out.println("x = " + x_1);
        }else{
            x_1 = (-b + Math.sqrt(delta)) / (2*a);
            x_2 = (-b - Math.sqrt(delta)) / (2*a);
            System.out.println("x_1 = " + x_1);
            System.out.println("x_2 = " + x_2);
       }
        entrada.close();
    }
}
