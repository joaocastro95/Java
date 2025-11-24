package Cinemas;

public class Consulta_Cinemas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cine_Roxy roxy = new Cine_Roxy();
		Cine_Caiçara caiçara = new Cine_Caiçara("Antigo cinema da\n"
				+ "Av. Conselheiro nébias - Boqueirão");
		
		caiçara.setlocalização("Av. Conselheiro Nébias com a Praia");
		caiçara.setnome("Cine Caiçara");
		System.out.println("Cine \t" + caiçara.getnome() + "\n ficava na esquina da:\t"
				+ caiçara.getlocalização());
		
		
        Cine_Praiamar praiamar = new Cine_Praiamar("Cinema moderno do Praiamar Shopping.");
        praiamar.setShopping("Praiamar Shopping");
        praiamar.setlocalização("Aparecida - Santos");
        praiamar.setQuantidadeSalas(10);

        System.out.println("Cine Praiamar no " + praiamar.getShopping());
        System.out.println("Localização: " + praiamar.getlocalização());
        System.out.println("Salas: " + praiamar.getQuantidadeSalas() + "\n");
        Cine_Miramar miramar = new Cine_Miramar();

	}

}