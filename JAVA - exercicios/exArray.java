package exerciciosAprendendoProgramar;

import java.util.Scanner;

public class exArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double soma =0;

		System.out.println("1 - Praticando preenchimento e imprimindo valor do array" + 
		"\n2 - Criando um vetor e alterando ele"
		+ "");
		System.out.printf("\nDigite a prática de array desejada: ");
		int nQuestao = sc.nextInt();

		switch (nQuestao) {
		case 1:
			int[] notas = new int[4];
			
			//PREENCHENDO O ARRAY
			System.out.println("\n---------- Preenchendo array ----------");
			for(int i = 0; i <= 3; i++) {
				System.out.printf("Digite um valor para preencher a posição ["+i+"]: ");
				notas[i] = sc.nextInt();
			}
			
			//IMPRIMINDO ARRAY
			System.out.println("\n---------- Imprimindo o array ---------");
			for(int i = 0; i <= 3; i++) {
				System.out.println("Posição ["+i+"]: "+notas[i]);
				
			}
			break;
		case 2:
			int[] numeros = new int[4];
			int aux = 0;
			
			//PREENCHENDO E ALTERANDO O ARRAY
			System.out.println("\n---------- Preenchendo array ----------");
			for(int i = 0; i <= 3; i++) {
				System.out.printf("Digite um valor para preencher a posição ["+i+"]: ");
				numeros[i] = sc.nextInt();
				
				if(numeros[i] % 2 == 0) {
					aux = numeros[i]*3;
					numeros[i] = aux;
				} else {
					numeros[i]++;
				}
			}
			
			//IMPRIMINDO ARRAY
			System.out.println("\n---------- Imprimindo o array alterado ---------");
			for(int i = 0; i <= 3; i++) {
				System.out.println("Posição ["+i+"]: "+numeros[i]);
				
			}
		}

	}

}
