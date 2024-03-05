package exerciciosAprendendoProgramar;

import java.util.Scanner;

public class exConversao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float res, ent;

		System.out.print("Digite a entrada para conversao de M em CM: ");
		ent = sc.nextFloat();

		res = ent * 100;

		System.out.println(ent+" m equivale a "+res + "0 cm");

	}

}
 		