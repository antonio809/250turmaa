package programas;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
            
        Scanner entrada = new Scanner(System.in);
        
        int[] numeros;
        numeros = new int[50];
        
        
        double valores[] = new double[10];
        
        String[] nomes = new String[1000];
        
        numeros [0] = 15;
        numeros [30] = 4;
        
        valores [9] = 1.75;

       nomes[12] = "Ariovaldo";
       nomes[0] = "Barbarina";
       
        System.out.println(nomes[12]);
        System.out.println(nomes[0]);
        
        double d = numeros[30] + valores[9];
        System.out.println(d);

        entrada.close();
    }
    
}
