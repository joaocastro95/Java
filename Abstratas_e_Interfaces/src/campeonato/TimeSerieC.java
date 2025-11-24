package campeonato;

public class TimeSerieC implements Time {

    private String nome;
    private int pontos;

    public TimeSerieC(String nome) {
        this.nome = nome;
        this.pontos = 0;
    }

    @Override
    public void registrarVitoria() {
        pontos += 3;
    }

    @Override
    public void registrarEmpate() {
        pontos += 1;
    }

    @Override
    public void registrarDerrota() {
        // não soma nada
    }

    @Override
    public int getPontos() {
        return pontos;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
