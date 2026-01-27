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
public class FastFood {
  public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Selecione uma opcao do menu:");
        System.out.println("1 - Hambúrguer (R$ 10,00)");
        System.out.println("2 - Cachorro-quente (R$ 8,00)");
        System.out.println("3 - Batata Frita (R$ 5,00)");

        System.out.print("Digite o número da sua escolha: ");
        int escolha = input.nextInt();

        if (escolha == 1) {
            System.out.println("Você escolheu Hambúrguer - R$ 10,00");
        } else if (escolha == 2) {
            System.out.println("Você escolheu Hot-Dog - R$ 8,00");
        } else if (escolha == 3) {
            System.out.println("Você escolheu Batata-Frita - R$ 5,00");
        }  
        
    }
    
}
