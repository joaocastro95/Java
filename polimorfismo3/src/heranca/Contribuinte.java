package heranca;

public class Contribuinte {
	
	private String nome;
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return(nome);
	}

	public void mostraClasse() {
		System.out.println("CLASSE Contribuinte");
	}
}
