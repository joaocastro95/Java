package cursoProgramacao;

import java.util.Scanner;

public class exfor6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número de repetições");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Digite o valor A e depois o B");
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if (b == 0) {
				System.out.println("Divisão impossivel");	
			}
			else {
				double div = (double) a / b;
				System.out.printf("%.1f%n", div);
			}
		}

		sc.close();

	}

}
