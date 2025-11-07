package construção_civil;

public class Construcao {
	private String tipo;
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void constroi() {
		System.out.println("FAZ-SE QUALQUER TIPO DE CONSTRUÇÃO");
	}
}
