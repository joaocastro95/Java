package cursoProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class ESTCOD1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a nota do primeiro bimestre:");
		double nota1 = sc.nextDouble();
		System.out.println("Digite a nota do primeiro bimestre:");
		double nota2 = sc.nextDouble();
		
		double notaFinal = (nota1 + nota2)/2;
		System.out.printf("Nota final = %.1f%n", notaFinal);
		
		if (notaFinal < 60.0) {
			System.out.println("Reprovado");
		}
		else {
			System.out.println("Aprovado");
		}
		
		sc.close();
	}

}
