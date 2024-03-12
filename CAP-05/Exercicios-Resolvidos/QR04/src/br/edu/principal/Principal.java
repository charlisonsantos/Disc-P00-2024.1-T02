package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			int cod, num_vei, num_acid;
			int maior = 0, menor = 0, cid_maior = 0, cid_menor = 0;
			int soma_vei = 0, soma_acid = 0, cont_acid = 0;

			for (int cont = 1; cont <= 5; cont++) {
			    System.out.println("Digite o c�digo da cidade, n�mero de ve�culos de passeio e n�mero de acidentes:");
			    cod = scanner.nextInt();
			    num_vei = scanner.nextInt();
			    num_acid = scanner.nextInt();

			    if (cont == 1) {
			        maior = num_acid;
			        cid_maior = cod;
			        menor = num_acid;
			        cid_menor = cod;
			    } else {
			        if (num_acid > maior) {
			            maior = num_acid;
			            cid_maior = cod;
			        }
			        if (num_acid < menor) {
			            menor = num_acid;
			            cid_menor = cod;
			        }
			    }

			    soma_vei += num_vei;

			    if (num_vei < 2000) {
			        soma_acid += num_acid;
			        cont_acid++;
			    }
			}

			System.out.println("Maior �ndice de acidentes: " + maior + " - Cidade: " + cid_maior);
			System.out.println("Menor �ndice de acidentes: " + menor + " - Cidade: " + cid_menor);

			double media_vei = soma_vei / 5.0;
			System.out.println("M�dia de ve�culos nas cinco cidades: " + media_vei);
		}

        int cont_acid = 0;
		if (cont_acid == 0) {
            System.out.println("N�o foi digitada nenhuma cidade com menos de 2000 ve�culos.");
        } else {
            double soma_acid = 0;
			double media_acid = soma_acid / (double) cont_acid;
            System.out.println("M�dia de acidentes de tr�nsito nas cidades com menos de 2000 ve�culos: " + media_acid);
        }
    }
}
