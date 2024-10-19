
package programas;
import java.util.Scanner;

 
public class MaisVelho {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ariovaldo: ");
        int ari = entrada.nextInt();
        
        System.out.print("Malvadeza: ");
        int mal = entrada.nextInt();
        
        System.out.print("Caled�nio: ");
        int cal = entrada.nextInt();
        
        if(ari == mal && mal == cal){
            System.out.println("As idades s�o iguais."); 
        }else if(ari > mal && ari > cal){
            System.out.println("Ariovaldo � o mais velho.");
        }else if(mal > ari && mal > cal){
            System.out.println("Malvadeza � o mais velho.");
        }else{
            System.out.println("Caled�nio � o mais velho.");
        }

        entrada.close();
    }
}
