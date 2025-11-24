package academia;

public class Musculacao extends Atividade {

    public Musculacao(String aluno, int duracao) {
        super(aluno, duracao);
    }

    @Override
    public double calcularCalorias() {
        return getDuracao() * 7.5; // exemplo de valor
    }
}
