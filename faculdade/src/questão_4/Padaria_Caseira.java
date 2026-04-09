package questão_4;

public class Padaria_Caseira extends Padaria{
    private String tipoForno;
    private boolean artesanal;
	

	 // Construtor padrão
    public Padaria_Caseira() {
        super();
    }
    
    // Construtor com parâmetros usando super()
    public Padaria_Caseira(String nome, String endereco, String tipoForno, boolean artesanal) {
        super(nome, endereco); // Chama construtor da superclasse
        this.tipoForno = tipoForno;
        this.artesanal = artesanal;
    }
    
    // Métodos sets e gets específicos
    public void setTipoForno(String tipoForno) {
        this.tipoForno = tipoForno;
    }
    
    public String getTipoForno() {
        return tipoForno;
    }
    
    public void setArtesanal(boolean artesanal) {
        this.artesanal = artesanal;
    }
    
    public boolean isArtesanal() {
        return artesanal;
    }
    
    // Sobrescrita do método
    @Override
    public void exibirInfo() {
        super.exibirInfo(); // Chama método da superclasse
        System.out.println("Tipo de Forno: " + tipoForno);
        System.out.println("Produção Artesanal: " + (artesanal ? "Sim" : "Não"));
    }
}
