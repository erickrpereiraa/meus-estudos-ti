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
public class AprovacaoEmprestimo {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário do cliente: ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a quantidade de pendências do cliente: ");
        int pendencias = scanner.nextInt();

        if (salario > 2500.00 && pendencias <= 2) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Empréstimo negado.");
        }

    }
    
}
