package view;

import model.Aluno;
import model.Professor;
// import model.Pessoa;

public class Principal {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Guilherme", "guilherme@fatec", 123);
		System.out.println(aluno1.entrarNaSala());
		
		Professor prof1 = new Professor("Rubens", "rl@fatec", 987);
		System.out.println(prof1.entrarNaSala());

		Professor prof2 = new Professor("Lara", "lr@fatec", 876);
		System.out.println(prof2.entrarNaSala("Dr."));
		
		// Pessoa pessoa1 = new Pessoa("Pessoa", "pessoa@fatec");
		// System.out.println(pessoa1.entrarNaSala());
		
	}
}
