package Exercicio6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        System.out.print("Numero: " + numero);
        System.out.print("\nSeu antecessor: " + (numero - 1));
        System.out.print("\nSeu sucessor: " + (numero + 1));
    }
}
