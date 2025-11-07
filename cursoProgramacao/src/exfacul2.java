import java.util.Scanner;

public class exfacul2 {

	public static void main(String[] args) {

	    System.out.println("Digite o valor de um número decimal para transformar em binário: ");
	    Scanner sc = new Scanner(System.in);

	    int decimal = sc.nextInt();
	    int binario = decimal;

	    String binarioString = "";

	    if (decimal == 0) {
	      binarioString = "0";
	    } else {
	      while (binario > 0) {
	        int resto = binario % 2;
	        binario /= 2;
	        binarioString = resto + binarioString;
	      }
	    }

	    
	    System.out.println("O número " + decimal + " em binário é: " + binarioString);
	    sc.close(); 
	    
	}
	}