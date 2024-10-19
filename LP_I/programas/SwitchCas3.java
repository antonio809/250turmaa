
package programas;
import java.util.Scanner;


public class SwitchCas3 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Escreva uma letra: ");
        char letra = entrada.next().charAt(0);
        
        switch(letra){
            case'a': case'A':
                System.out.println("Digitou 'a' ou 'A'.");
                break;
            case'e': case'E':
                System.out.println("Digitou 'E' ou 'E'.");
                break;
            case'i': case'I':
                System.out.println("Digitou 'i' ou 'I'.");
                break;
            case'o': case'O':
                System.out.println("Digitou 'o' ou 'O'.");
                break;
            case'u': case'U':
                System.out.println("Digitou 'u' ou 'U'.");
                break;
            default:
                System.out.println("Consoante.");
                break;
        }
        entrada.close();
    }
}
