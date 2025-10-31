package construtor_herança;

public class Papelaria {

	private String caderno;
	private String lapis;
	
	Papelaria (){
		System.out.println("acesso ao método construtor padrão da superclasse Papelaria");
	}
	
	Papelaria(String lapis){
		this.lapis = lapis;
	}
	
	public void set_caderno(String caderno) {
		this.caderno = caderno;
	}
	
	public String get_caderno() {
		return caderno;
	}
	
	public String get_lapis() {
		return lapis;
	}
	
}
