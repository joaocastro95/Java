package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class ex3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student st = new Student();
		
		System.out.print("Nome: ");
		st.name = sc.nextLine();
		System.out.print("Nota 1: ");
		st.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		st.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		st.nota3 = sc.nextDouble();
		
		System.out.printf("Nota final %.2f pontos%n", st.notaFinal());
		
		if (st.notaFinal() < 60.0) {
			System.out.println("FALHOU");
			System.out.printf("FALTAM %.2f PONTOS%n", st.faltamPontos());
			}
			else {
			System.out.println("PASSOU");
			}
			sc.close();
		

		sc.close();
	}

}
