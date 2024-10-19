package programas;
import java.util.Scanner;

public class Aula0910 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int v[] = new int[6];

        v[0] = 1;
        v[1] = 0;
        v[2] = 5;
        v[3] = -2;
        v[4] = -5;
        v[5] = 7;

        //inicializando a porra do vetor
        for(int i = 0; i < 6; i++){
            System.out.print("v[" + (i+1) + "] = ");
            v[i] = entrada.nextInt();
        }

        System.out.println("Elementos de v");
        //exibindo os dados da porra do vetor
        for(int i = 0; i < 6; i++){
            System.out.println("v[" + (i+1) + "] = " + v[i]);
        }

        entrada.close();
    }
}
