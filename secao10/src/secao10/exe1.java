package secao10;

import java.util.Locale;
import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número de 0 a 10? ");
		
		int n = sc.nextInt();
		
		while (n > 10) {
			System.out.print("Erro, tente de novo");
			n= sc.nextInt();
			}
		
		int[] vect = new int[n];
		
		
		for (int i=0; i<n; i++) {
			System.out.print("Agora digite um número: ");
			vect[i] = sc.nextInt();
			}
		
		System.out.println("NUMEROS NEGATIVOS:");
		
		for (int i=0; i<n; i++) {
			if(vect[i]<0){
			System.out.println(vect[i]);
			}
		}			
	
		sc.close();
	}

}
