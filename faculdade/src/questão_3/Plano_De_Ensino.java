package questão_3;

public class Plano_De_Ensino {
	
    private String materia;
    private String conteudoProgramatico;
    private String criterioAvaliacao;
    private String bibliografia;
    
    Plano_De_Ensino(){
    }
    
    Plano_De_Ensino(String materia, String conteudoProgramatico, String criterioAvaliacao, String bibliografia) {
    	this.materia = materia;
    	this.conteudoProgramatico = conteudoProgramatico;
    	this.criterioAvaliacao = criterioAvaliacao;
    	this.bibliografia = bibliografia;
    }
    
    public void setMateria(String materia) {
        this.materia = materia;
    }
    public String getMateria() {
        return materia;
    }

    public void setConteudoProgramatico(String conteudoProgramatico) {
        this.conteudoProgramatico = conteudoProgramatico;
    }
    public String getConteudoProgramatico() {
        return conteudoProgramatico;
    }

    public void setCriterioAvaliacao(String criterioAvaliacao) {
        this.criterioAvaliacao = criterioAvaliacao;
    }
    public String getCriterioAvaliacao() {
        return criterioAvaliacao;
    }
    
    public void setBibliografia(String bibliografia) {
        this.bibliografia = bibliografia;
    }
    public String getBibliografia() {
        return bibliografia;
    }
}
