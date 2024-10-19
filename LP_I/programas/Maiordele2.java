
package programas;
import java.util.Scanner;


public class Maiordele2 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         System.out.print("Insira um número inteiro: ");
         int n1 = entrada.nextInt();
         
         System.out.print("Insira outro número inteiro: ");
         int n2 = entrada.nextInt();
         
         if(n1 == n2){
             System.out.println("Os números são iguais!");
         }else if(n1 > n2){
             System.out.println(n1+" - "+n2+" = "+ (n1-n2));
         }else{
             System.out.println(n2+" - "+n1+" = "+ (n2-n1));
         }

         entrada.close();
    }
         
}
