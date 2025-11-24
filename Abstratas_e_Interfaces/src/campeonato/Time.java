package campeonato;

public interface Time {

    public void registrarVitoria();
    public void registrarEmpate();
    public void registrarDerrota();

    public int getPontos();
    public String getNome();
}
