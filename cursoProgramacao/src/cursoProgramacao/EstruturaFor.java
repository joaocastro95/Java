package cursoProgramacao;

import java.util.Scanner;

public class EstruturaFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de numeros:");
		int N = sc.nextInt();

		System.out.println("Agora digite os números");
		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}

		System.out.println(soma);
		sc.close();

	}

}
