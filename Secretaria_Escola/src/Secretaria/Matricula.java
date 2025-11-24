package Secretaria;

public class Matricula extends Quarto_Ciclo_SI {
	
	public static void main (String args[]) {
		
		Quarto_Ciclo_SI E = new Quarto_Ciclo_SI();
		
		E.setMatricula_aluno("RA1220000");
		System.out.println("Matricula: \t" + E.getMatricula_aluno());
	}

}
