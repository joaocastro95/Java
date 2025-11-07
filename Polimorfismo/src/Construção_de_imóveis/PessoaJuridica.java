package Construção_de_imóveis;

public class PessoaJuridica extends Contribuinte {
	private String cnpj;
	
	public void setCnpj (String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return(cnpj);
	}

	public void mostraClasse() {
		System.out.println("CLASSE PessoaJuridica");
	}
}
