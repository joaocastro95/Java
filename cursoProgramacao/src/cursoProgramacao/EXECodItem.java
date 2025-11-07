package cursoProgramacao;

import java.util.Scanner;

public class EXECodItem {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Digite o código do item que voce quer:");
			System.out.println("1. Cachorro quente / R$ 4,00");
			System.out.println("2. X-salada / R$ 4,50");
			System.out.println("3. X-Bacon / R$ 5,00");
			System.out.println("4. Torrada / R$ 2,00");
			System.out.println("5. Refrigerante / R$ 1,50");
			int codigo = sc.nextInt();
			
			System.out.println("Digite a quantidade que voce quer: ");
			int quantidade = sc.nextInt();
			
			double total;
			if (codigo == 1) {
				total = quantidade * 4.0;
			}
			else if (codigo == 2) {
				total = quantidade * 4.5;
			}
			else if (codigo == 3) {
				total = quantidade * 5.0;
			}
			else if (codigo == 4) {
				total = quantidade * 2.0;
			}
			else {
				total = quantidade * 1.5;
			}

			System.out.printf("Total: R$ %.2f%n", total);
			
			sc.close();
		}
	}
