package cursoProgramacao;

import java.util.Scanner;

public class ExFor3 {

	public static void main(String[] args) {
		
		System.out.print("Digite um valor inteiro entre 1 e 1000: ");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();	
		
		if (x < 1 || x > 1000) {
	        System.out.println("Valor de X fora do intervalo especificado.");
		 }		
		
		else {
		for (int i=1; i<=x; i++) {
			
			if (i % 2 != 0) {
				System.out.println(i) ;
			}
		}
		
		
		sc.close();
	}
}
}