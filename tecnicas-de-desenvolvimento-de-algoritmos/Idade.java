/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Exercicios.Aula.Dia22_08;
import java.util.Scanner;
/**
 *
 * @author erick
 */
public class Idade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner print = new Scanner (System.in);
        System.out.print("Digite seu nome: ");
        String nome = print.next();
        System.out.print("Digite sua idade: ");
        int idade = print.nextInt();
        System.out.println("O nome digitado corresponde a "+nome+" e sua idade seria "+idade+" anos de idade.");
        
    }
    
}
