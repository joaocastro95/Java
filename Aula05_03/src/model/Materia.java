package model;

public class Materia {
    private String topico;
    private String descricao;

    public Materia(String topico, String descricao) {
        this.topico = topico;
        this.descricao = descricao;
    }

    public String getTopico() { return topico; }
}