package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (// Leitura do n�mero N
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Digite o n�mero de valores a serem lidos (N): ");
			int n = scanner.nextInt();

			// Loop para cada valor a ser lido
			for (int i = 1; i <= n; i++) {
			    System.out.print("Digite um valor inteiro e positivo: ");
			    int num = scanner.nextInt();

			    // C�lculo do fatorial
			    int fat = 1;
			    for (int j = 1; j <= num; j++) {
			        fat *= j;
			    }

			    // Exibi��o da tabela
			    System.out.println("Valor lido: " + num + ", Fatorial: " + fat);
			}
		}
    }
}
