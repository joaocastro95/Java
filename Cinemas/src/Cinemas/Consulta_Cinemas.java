package Cinemas;

public class Consulta_Cinemas {
	public static void main(String[] args) {
		
		Cine_Roxy roxy = new Cine_Roxy();
		
		Cine_Caiçara caiçara = new Cine_Caiçara("Antigo cinema da\nAv. Conselheiro Nébias - Boqueirão");
		caiçara.setlocalização("Avenida Conselheiro Nébias com a praia");
		caiçara.setnome("Cine Caiçara");
		System.out.println("Cine " + caiçara.getnome() + " ficava na esquina da: " + caiçara.getlocalização());

		System.out.println("\n--- Cinemas do Shopping ---");
		
		Cine_Praiamar praiamar = new Cine_Praiamar("Cinema moderno e bem localizado no bairro Aparecida");
		Cine_Balneario balneario = new Cine_Balneario("Tradicional cinema no Shopping Balneário no Gonzaga");
	}
}
