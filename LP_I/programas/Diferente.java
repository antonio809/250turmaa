
package programas;
import java.util.Scanner;


public class Diferente {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int num;
        
        System.out.println("Positivos ou Negativos");
        System.out.print("Numero: ");
        num = entrada.nextInt();
        
        if(num < 0){
            System.out.println("Esse numero e negativo.");
        }else{
            System.out.println("Esse numero e positivo.");
        }
        entrada.close();   
    }
}
