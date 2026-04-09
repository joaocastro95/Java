package aularevisao;

public class AlunoHer extends PessoaHer {
    private int ra;

    public AlunoHer(String nome, String email, int ra) {
        super(nome, email);
        this.ra = ra;
    }
}