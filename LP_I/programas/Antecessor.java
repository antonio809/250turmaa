/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programas;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Antecessor {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Insira um numero inteiro: ");
        int n = entrada.nextInt();
        
        
        int ant = n - 1;
        int suc = n + 1;
        
        System.out.println("Antecessor: " + ant);
        System.out.println("Sucessor: " + suc);
        
        
        entrada.close();
    }
    
}
