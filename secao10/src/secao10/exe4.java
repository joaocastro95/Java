package secao10;

import java.util.Locale;
import java.util.Scanner;

public class exe4 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n;
		
	    System.out.print("Quantas numeros voce vai digitar? ");
	    n = sc.nextInt();
		
	    int[] numero = new int[n];
	    
	    for (int i=0; i<n; i++) {
	        System.out.print("Digite um numero: ");
	        numero[i] = sc.nextInt();
	    }
	    
		sc.close();
	}

}
