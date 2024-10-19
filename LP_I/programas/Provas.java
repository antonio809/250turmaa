
package programas;
import java.util.Scanner;

public class Provas {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Nota 1: ");
        double nota1 = entrada.nextDouble();
        
        System.out.print("Nota 2: ");
        double nota2 = entrada.nextDouble();
        
        System.out.print("Nota 3: ");
        double nota3 = entrada.nextDouble();
        
        double media = (nota1 + nota2 + nota3)/3;
        
        if(media < 3 && media >= 0){
            System.out.println("Aluno Reprovado.");   
        }
        if(media >= 3 && media < 6){
            System.out.println("Aluno de Recuperação.");
        }
        if(media >= 6 && media <= 10){
            System.out.println("Aluno Aprovadissimo.");
        }
        
        entrada.close();
    }
    
}
