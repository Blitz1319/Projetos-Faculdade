package exerciciosAprendendoProgramar;

import java.text.NumberFormat;
import java.util.Scanner;

public class exCondicional {

	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("--------------LISTA DE EXERCÍCIO SOBRE CONDIÇÕES---------------");

		double n1, n2;

		System.out.println("\n1 - QUESTÃO 1" + "\n2 - QUESTÃO 2" + "\n3 - QUESTÃO 3" + "\n4 - QUESTÃO 4"
				+ "\n5 - QUESTÃO 5" + "\n6 - QUESTÃO 6" + "\n7 - QUESTÃO 7" + "\n8 - QUESTÃO 8" + "\n9 - QUESTÃO 9"
				+ "\n10 - QUESTÃO 10");
		System.out.printf("\nDigite a questão desejada: ");
		int nQuestao = sc.nextInt();

		switch (nQuestao) {
		case 1:
			System.out.printf("\nDigite a sua idade: ");
			int age = sc.nextInt();

			if (age >= 18) {
				System.out.println("Você é maior de idade!");
			} else {
				System.out.println("Você é menor de idade!");
			}
			break;

		case 2:
			System.out.printf("\nDigite o primeiro número: ");
			n1 = sc.nextDouble();

			System.out.printf("Digite o segundo número: ");
			n2 = sc.nextDouble();

			if (n1 > n2) {
				System.out.println("\nO primeiro número é maior!");
			} else {
				System.out.println("\nO segundo número é maior!");
			}
			break;

		case 3:
			System.out.printf("\nDigite o primeiro número: ");
			n1 = sc.nextDouble();

			System.out.printf("Digite o segundo número: ");
			n2 = sc.nextDouble();

			double sum = n1 + n2;

			if (sum > 20) {
				sum += 8;
				System.out.println(sum);
			} else {
				sum -= 5;
				System.out.println(sum);
			}
			break;

		case 4:
			System.out.printf("\nInforme so salário bruto do funcionário: R$ ");
			n1 = sc.nextDouble();

			System.out.printf("Informe o valor da parcela da linha de credito: R$");
			n2 = sc.nextDouble();

			double valorMaximoPrestacao = n1 * 0.30;

			if (n2 <= valorMaximoPrestacao) {
				System.out.println("Seu emprestimo pode ser concedido!");
			} else {
				System.out.println("Seu emprestimo não pode ser concedido. Parcela incopátivel com salário!");
			}
			break;

		case 5:
			System.out.printf("\nDigite um número: ");
			n1 = sc.nextDouble();

			if (n1 % 2 == 0) {
				System.out.println("O número digitado é par!");
			} else {
				System.out.println("O número digitado é ímpar!");
			}
			break;

		case 6:
			System.out.printf("\nDigite um número: ");
			n1 = sc.nextDouble();

			if (n1 % 3 == 0) {
				System.out.println("O número digitado é múltiplo de 3!");
			} else {
				System.out.println("O número digitado não é múltiplo de 3!");
			}
			break;

		case 7:
			System.out.printf("\nDigite o volume total do tanque do carro: ");
			n1 = sc.nextDouble();

			double g = n1 * 3.79;
			double a = n1 * 2.90;

			System.out.println("\nNa gasolina você pagará para completar o tanque: " + format.format(g) + ""
					+ "\nNo álcool você pagará para completar o tanque: " + format.format(a));
			break;
		case 8:
			System.out.printf("\nDigite a quantidade de kilos pescados: ");
			n1 = sc.nextDouble();

			if (n1 > 50) {
				double valorMulta = (n1 - 50) * 4;
				System.out.println("\nJoão deve pagar de multa: " + format.format(valorMulta));
			}
			break;

		case 9:
			double pesoIdeal;

			System.out.printf("\nDigite sua altura: ");
			n1 = sc.nextDouble();

			sc.nextLine();

			System.out.printf("Digite H se for homem M se for mulher: ");
			String sex = sc.next();

			if (sex == "H") {
				pesoIdeal = (72.7 * n1) - 58;
				System.out.println("\nSeu peso ideal é: " + pesoIdeal + "Kg");
			} else if (sex == "M") {
				pesoIdeal = (62.1 * n1) - 44.7;
				System.out.println("\nSeu peso ideal é: " + pesoIdeal + "Kg");
			}
			break;

		case 10:
			System.out.printf("\nDigite um número: ");
			n1 = sc.nextDouble();

			if (n1 >= 100 && n1 <= 200) {
				System.out.println("Este número está entre 100 e 200!");
			} else {
				System.out.println("Este número não está entre 100 e 200!");
			}
			break;
		default:
			break;
		}

	}

}
