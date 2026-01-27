/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.Exercicios.Aula.Dia22_08;
import java.util.Scanner;

/**
 *
 * @author erick
 */
public class GasolinaDoCarro {

    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
       
        System.out.print("Digite o total de litros que cabe no tanque: ");
        double litros = leia.nextDouble();
        
        System.out.print("Digite o valor da gasolina por litro: ");
        double valorPorLitro = leia.nextDouble();
        
        double valorTotal = litros * valorPorLitro;
      
        System.out.printf("O valor total gasto para encher o tanque corresponde a: R$ %.2f%n", valorTotal);
     
    }
}
