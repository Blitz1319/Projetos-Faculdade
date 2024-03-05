package exerciciosAprendendoProgramar;

import java.util.Scanner;

public class exArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float  area, base, altura;
		
		System.out.println("Digite a base: ");
		base = sc.nextFloat();
		
		System.out.println("Digite a altura: ");
		altura = sc.nextFloat();
		
		area = (base*altura)/2;
		
		System.out.println(area);

	}

}
