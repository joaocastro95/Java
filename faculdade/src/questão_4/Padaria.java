package questão_4;

public class Padaria {

	private String nome;
	private String endereco;
	
	Padaria (){
		System.out.println("acesso ao método construtor padrão da superclasse Padaria");
	}
	
	Padaria(String nome, String endereco){
		this.nome = nome;
		this.endereco = endereco;
	}
	
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
	
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
    public void exibirInfo() {
        System.out.println("Padaria: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}
