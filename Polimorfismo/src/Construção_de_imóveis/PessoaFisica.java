package Construção_de_imóveis;

public class PessoaFisica extends Contribuinte{
	
	private String rg;
	
	public void setRg (String rg) {
		this.rg = rg;
	}
	
	public String getRG() {
		return(rg);
	}
	
	public void mostraClasse() {
		System.out.println("CLASSE PessoaFisica");
	}

}
