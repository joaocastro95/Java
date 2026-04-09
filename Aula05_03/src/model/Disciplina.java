package model;

public class Disciplina {
    private String codigo;
    private String ementa;

    public Disciplina(String codigo, String ementa) {
        this.codigo = codigo;
        this.ementa = ementa;
    }

    public String getCodigo() { return codigo; }
}