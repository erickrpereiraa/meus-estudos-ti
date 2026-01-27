/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cruzeirodosul.exercicioa2;
import java.util.Scanner;

/**
 *
 * @author erick
 */
public class Desconto {

   public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o valor original do produto: ");
        double valorOriginal = input.nextDouble();

        double desconto = valorOriginal * 0.10;

        double valorFinal = valorOriginal - desconto;

        System.out.printf("O valor final do produto com desconto é: R$%.2f\n", valorFinal);

    }
    
}
