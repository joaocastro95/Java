package academia;

public class Pilates extends Atividade {

    public Pilates(String aluno, int duracao) {
        super(aluno, duracao);
    }

    @Override
    public double calcularCalorias() {
        return getDuracao() * 5.0; // exemplo de valor
    }
}
