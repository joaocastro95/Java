package cursoProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class Exfor5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de repetições");
		
		int N = sc.nextInt();
		

		
		for (int i=0; i<N; i++) {
			
		System.out.println("Digite 3 numeros");
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("Sua media é %.1f%n", media);

	}
		sc.close();
}
}