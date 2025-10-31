package Cinemas;

public class Cine_Praiamar extends Cinemas_do_Shopping {
	
	Cine_Praiamar(String descricao) {
		super(descricao); // Chama o construtor da superclasse
		setlocalização("Praiamar Shopping - Aparecida");
		setnome("Cine Praiamar");
		setsalas(8);
		
		System.out.println(getnome() + " localizado em " + getlocalização() + 
				" possui " + getsalas() + " salas.");
	}
}