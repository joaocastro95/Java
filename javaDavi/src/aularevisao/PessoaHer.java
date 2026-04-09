package aularevisao;

abstract class PessoaHer {
    protected String nome;
    private String email;

    public String getNome() { return nome; }

    public String getEmail() { return email; }

    public PessoaHer(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}