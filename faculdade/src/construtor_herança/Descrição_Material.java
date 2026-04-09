package construtor_herança;

public class Descrição_Material {
	
    private String marca_caderno;
    private boolean lapis_colorido;
    private int quantidade_borracha;
    
    Descrição_Material (){
    	super();
        System.out.println("acesso ao método construtor da Material_Escolar");
    }
    
	Descrição_Material(String marca_caderno, boolean lapis_colorido, int quantidade_borracha){
		this.marca_caderno = marca_caderno;
		this.lapis_colorido = lapis_colorido;
		this.quantidade_borracha = quantidade_borracha;
	}
    

    // Métodos getters
    public String get_marca_caderno() {
        return marca_caderno;
    }

    public boolean get_lapis_colorido() {
        return lapis_colorido;
    }

    public int get_quantidade_borracha() {
        return quantidade_borracha;
    }
}
