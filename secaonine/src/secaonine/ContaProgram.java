package secaonine;

import entities.Conta;

public class ContaProgram {
	
	public static void main(String[] args) {
		
		Conta c = new Conta();
		
		c.nome = "Joao";
		c.cpf = "43426715813";
		c.depositar(100);
		c.sacar(20.0);
		
		System.out.println(c.nome);
		System.out.println(c.cpf);
		System.out.println(c.getSaldo());
	}

}
