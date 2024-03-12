package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo, nht;
        double sal_min = 450.0, valor, sal_inicial, aux, sal_final;
        String turno, categoria;

        for (int cont = 1; cont <= 10; cont++) {
            System.out.println("Informe o c�digo, n�mero de horas trabalhadas, turno (M/V/N) e categoria (G/O):");
            codigo = scanner.nextInt();
            nht = scanner.nextInt();
            turno = scanner.next().toUpperCase();
            categoria = scanner.next().toUpperCase();

            while (!turno.equals("M") && !turno.equals("V") && !turno.equals("N")) {
                System.out.println("Turno inv�lido. Informe o turno novamente (M/V/N):");
                turno = scanner.next().toUpperCase();
            }

            while (!categoria.equals("G") && !categoria.equals("O")) {
                System.out.println("Categoria inv�lida. Informe a categoria novamente (G/O):");
                categoria = scanner.next().toUpperCase();
            }

            if (categoria.equals("G")) {
                if (turno.equals("N")) {
                    valor = sal_min * 18 / 100;
                } else {
                    valor = sal_min * 15 / 100;
                }
            } else {
                if (turno.equals("N")) {
                    valor = sal_min * 13 / 100;
                } else {
                    valor = sal_min * 10 / 100;
                }
            }

            sal_inicial = nht * valor;

            if (sal_inicial <= 300) {
                aux = sal_inicial * 20 / 100;
            } else if (sal_inicial < 600) {
                aux = sal_inicial * 15 / 100;
            } else {
                aux = sal_inicial * 5 / 100;
            }

            sal_final = sal_inicial + aux;

            System.out.println("C�digo: " + codigo + ", Horas trabalhadas: " + nht + ", Valor da hora: " + valor +
                    ", Sal�rio inicial: " + sal_inicial + ", Aux�lio alimenta��o: " + aux + ", Sal�rio final: " + sal_final);
        }
    }
}
