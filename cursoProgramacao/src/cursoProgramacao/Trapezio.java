package cursoProgramacao;

import java.util.Scanner;

public class Trapezio {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		double b, B, h, area;
		
		System.out.println("Vamos calcular a àrea do trapézio");
		System.out.println("Digite o valor da base menor: ");
		b = sc.nextInt();
		System.out.println("Digite o valor da base maior: ");
		B = sc.nextInt();
		System.out.println("Digite o valor da altura: ");
		h = sc.nextInt();
		
		area = ((b+B)/2)*h;
		
		System.out.println("A área equivale a: " + area);
		
		sc.close();
	}

}
