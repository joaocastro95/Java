package construção_civil;

public class Apartamento extends Construcao {

	Construcao apartamento = new Construcao();
	
	Apartamento() {
		apartamento.setTipo("APARTAMENTO");
	}
	
	public void constroi() {
		System.out.println("FAZ-SE " + apartamento.getTipo());
	}
}
