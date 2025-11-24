package abstrata;

public class Condominio extends Conceito{
	
	protected String getNome_Condominio() {
		return "Vila nova";
	}
	
	protected double calcula_condominio(double a) {
		return a*1.066;
	}
	
	public void endereço_condominio() {
		System.out.println("Rua A, nº 22");
	}

}
