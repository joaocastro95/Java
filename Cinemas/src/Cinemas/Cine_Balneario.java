package Cinemas;

public class Cine_Balneario extends Cinemas_do_Shopping {
	
	Cine_Balneario(String descricao) {
		super(descricao);
		setlocalização("Shopping Balneário - Gonzaga");
		setnome("Cine Balneário");
		setsalas(6);
		
		System.out.println(getnome() + " localizado em " + getlocalização() + 
				" possui " + getsalas() + " salas.");
	}
}