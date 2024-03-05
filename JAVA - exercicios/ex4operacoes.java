package exerciciosAprendendoProgramar;

import java.util.Scanner;

public class ex4operacoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int decisao = 1;
		double num1, num2, res;
		System.out.println("\n1 - Operação (+)" + "\n2 - Operação (-)" + "\n3 - Operação (/)" + "\n4 - Operação (*)"
				+ "\n0 - EXIT");
		System.out.printf("\nDigite a operação desejada: ");
		decisao = sc.nextInt();
		
		while(decisao!=0) {

			System.out.println("Digite o 1º número para a operação: ");
			num1 = sc.nextDouble();
			System.out.println("Digite o 2º número para a operação: ");
			num2 = sc.nextDouble();

			switch (decisao) {
			case 1:
				res = num1 + num2;
				System.out.println("A soma dos números é: " + res);
				break;

			case 2:
				res = num1 - num2;
				System.out.println("A diferença entre os números é: " + res);
				break;

			case 3:
				res = num1 / num2;
				System.out.println("A divisão entre os números é: " + res);
				break;

			case 4:
				res = num1 * num2;
				System.out.println("A multiplicação entre os números é: " + res);
			default:
				System.out.println("PROGRAMA FINALIZADO!");
				break;
			}
			
			System.out.println("\n1 - Operação (+)" + "\n2 - Operação (-)" + "\n3 - Operação (/)" + "\n4 - Operação (*)"
					+ "\n0 - EXIT");
			System.out.printf("\nDigite a operação desejada: ");
			decisao = sc.nextInt();
			
			if(decisao == 0) {
				System.out.println("\nPROGRAMA FINALIZADO!");
			}
			
		}

	}

}
