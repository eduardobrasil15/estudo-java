package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		double x = 10.35784;
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println(x);
		System.out.printf("%.2f%n", x); /* imprimir com 2 casas apos a virgula*/
		System.out.printf("%.4f%n", x); /* imprimir com 4 casas apos a virgula*/
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("RESULTADO = " + x + " metros");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		System.out.printf("%s tem %d de anos e ganha R$ %.2f reais%n", nome, idade, renda);
		

	}

}
