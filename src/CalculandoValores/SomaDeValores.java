package CalculandoValores;

import java.util.Scanner;

public class SomaDeValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor A: ");
        int valorA = scanner.nextInt();
        System.out.println("Valor B: ");
        int valorB = scanner.nextInt();
        System.out.println("Valor C: ");
        int valorC = scanner.nextInt();
        scanner.close();

        int somaDeValores = valorA + valorB;

        System.out.println("A soma dos Valores: " + valorA + " + " + valorB + " tem como resultado " + somaDeValores);

        if (somaDeValores < valorC) {
            System.out.println(somaDeValores + " é menor que " + valorC);
        } else if (somaDeValores == valorC) {
            System.out.println(somaDeValores + " é igual a " + valorC);
        } else {
            System.out.println(somaDeValores + " é maior que " + valorC);
        }

        System.out.println("Obrigado por ajudar!");

    }
}
