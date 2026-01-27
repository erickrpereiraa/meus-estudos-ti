/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cruzeirodosul.exercicioa2;

/**
 *
 * @author erick
 */
import java.util.Scanner;

public class ConsumoDeCombustivel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite a quantidade de combustível gasto (em litros): ");
        double combustivel = scanner.nextDouble();

        double consumoMedio = distancia / combustivel;

        System.out.printf("O consumo médio é: %.2f km/l%n", consumoMedio);

    }
}
