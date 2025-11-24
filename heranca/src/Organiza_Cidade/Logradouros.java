package Organiza_Cidade;

public class Logradouros extends Regiao_de_Santos {
	
	Logradouros(){
		super("l");
	}
	
	private String tipo_logradouro;
	private String local_logradouro;

	public void setTipo_logradouro(String tipo_logradouro) {
		this.tipo_logradouro = tipo_logradouro;
	}
	
	public void setLocal_logradouro(String local_logradouro) {
		this.local_logradouro = local_logradouro;
	}
	
	public String getTipo_logradouro() {
		return tipo_logradouro;
	}
	
	public String getLocal_logradouro() {
		return local_logradouro;
	}
}
