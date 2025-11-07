package cursoProgramacao;

import java.util.Scanner;
import java.util.Locale;

public class Exercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a largura do terreno");
		double largura = sc.nextDouble();
		System.out.println("Digite o comprimento do terreno");
		double comprimento = sc.nextDouble();
		System.out.println("Digite o valor por metro quadrado");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("Area = %.2f%n" , area);
		System.out.printf("Preco = %.2f%n" , preco);
		
		sc.close();

	}

}
