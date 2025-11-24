package academia;

public abstract class Atividade {

    private String aluno;
    private int duracao; // em minutos

    public Atividade(String aluno, int duracao) {
        this.aluno = aluno;
        this.duracao = duracao;
    }

    public String getAluno() {
        return aluno;
    }

    public int getDuracao() {
        return duracao;
    }

    // método abstrato → cada atividade terá seu próprio valor calórico
    public abstract double calcularCalorias();

    // método comum
    public void mostrarInfos() {
        System.out.println("Aluno: " + aluno);
        System.out.println("Duração: " + duracao + " min");
    }
}