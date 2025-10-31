package construtor_herança;

public class Material_Escolar extends Papelaria {
	private double preço_caderno;
	private int quantidade_caixas_lapis;
	
	Material_Escolar (){
		super();
	}
	
	Material_Escolar(double preço_caderno, int quantidade_caixas_lapis){
		this.preço_caderno = preço_caderno;
		this.quantidade_caixas_lapis = quantidade_caixas_lapis;
	}
	
	public double get_preço_caderno(){
		return preço_caderno;
	}
	
	public int get_quantidade_caixas_lapis() {
		return quantidade_caixas_lapis;
	}
}
