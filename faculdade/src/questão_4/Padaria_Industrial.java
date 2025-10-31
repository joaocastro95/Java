package questão_4;

public class Padaria_Industrial extends Padaria{
	
		private int maquinarios;
	    private boolean automatizada;
	    
	    // Construtor padrão
	    public Padaria_Industrial() {
	        super(); // Chama construtor da superclasse
	    }
	    
	    // Construtor com parâmetros usando super()
	    public Padaria_Industrial(String nome, String endereco, int maquinarios, boolean automatizada) {
	        super(nome, endereco); // Chama construtor da superclasse
	        this.maquinarios = maquinarios;
	        this.automatizada = automatizada;
	    }
	    
	    // Métodos sets e gets específicos
	    public void setMaquinarios(int maquinarios) {
	        this.maquinarios = maquinarios;
	    }
	    
	    public int getMaquinarios() {
	        return maquinarios;
	    }
	    
	    public void setAutomatizada(boolean automatizada) {
	        this.automatizada = automatizada;
	    }
	    
	    public boolean isAutomatizada() {
	        return automatizada;
	    }
	    
	    // Sobrescrita do método
	    @Override
	    public void exibirInfo() {
	        super.exibirInfo(); // Chama método da superclasse
	        System.out.println("Número de Maquinários: " + maquinarios);
	        System.out.println("Automatizada: " + (automatizada ? "Sim" : "Não"));
	    }
}
