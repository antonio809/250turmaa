/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
import java.util.Scanner;

public class Exercício04 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        String texto;
        int numeroInteiro;
        double pontoFlutuante;
       
        System.out.print("Informe um texto: ");
        texto = entrada.next();
        System.out.print("Informe um numero inteiro: ");
        numeroInteiro = entrada.nextInt();
        System.out.print("Informe um numero ponto flutuante: ");
        pontoFlutuante = entrada.nextDouble();
        
        System.out.println();
        System.out.println("Texto: " + texto);
        System.out.println("Numero Inteiro: " + numeroInteiro);
        System.out.println("Numero Ponto Flutuante: " + pontoFlutuante);
        
        entrada.close();
        
        
        
    }
    

    
}
