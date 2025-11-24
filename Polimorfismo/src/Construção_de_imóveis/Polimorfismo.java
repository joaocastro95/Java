package Construção_de_imóveis;

import javax.swing.*;

public class Polimorfismo {
	public static void main (String args[]) {
		
		/*declaração de objeto do tipo da superclasse inicializando como vazio*/
		
		Contribuinte pessoa = null;
		
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("digitar opção: valor numérico entre 1 e 4"));
		
		switch(tipo) {
		case 1:
			pessoa = new Contribuinte(); break;
		case 2:
			pessoa = new PessoaFisica(); break;
		case 3:
			pessoa = new PessoaJuridica(); break;
		case 4:
			pessoa = new Funcionario(); break;
			
			default: {System.out.println("tipo não pertence à família");
			
				System.exit(0);}
			}
		
		pessoa.mostraClasse();
	}
}
