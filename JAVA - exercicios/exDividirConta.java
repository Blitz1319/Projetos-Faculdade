package exerciciosAprendendoProgramar;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class exDividirConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.##");
		NumberFormat z = NumberFormat.getCurrencyInstance();
		Scanner sc = new Scanner(System.in);
		
		float valorConta, valorRacha;
		float valorPaulo;
		int valorJoao, valorCarlos;
		
		System.out.printf("Digite o valor total da conta: ");
		valorConta = sc.nextFloat();
		
		valorRacha = valorConta/3;
		
		valorJoao = (int) valorRacha;
		valorCarlos = (int) valorRacha;
		
		valorPaulo = valorConta - valorJoao - valorCarlos;
		
		System.out.println(z.format(valorPaulo));
		System.out.println(z.format(valorCarlos));
		System.out.println(z.format(valorJoao));
		
	}

}
