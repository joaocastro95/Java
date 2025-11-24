package abstração;

public abstract class Classe_Abstrata {

	private String mensagem;
	
	protected void set_mensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	protected String get_mensagem() {
		return mensagem;
	}
	
	protected abstract void mostra_mensagem();
}
