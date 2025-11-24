package metodos;

public class Ficha_funcionarios {
    private String nome;
    private int idade;
    private String profissão;
    private double salário;

    Ficha_funcionarios e;
    
    // Primeiro construtor
    Ficha_funcionarios(String nome, String profissão, int idade, double salário) {
        this.nome = nome;
        this.profissão = profissão;
        this.idade = idade;
        this.salário = salário;
    }

    // Segundo construtor (ordem diferente dos parâmetros)
    Ficha_funcionarios(int idade, double salário, String nome, String profissão) {
        this.nome = nome;
        this.profissão = profissão;
        this.idade = idade;
        this.salário = salário;
    }

    // Terceiro construtor (cópia de objeto)
    Ficha_funcionarios(Ficha_funcionarios e) {
        this.e = e;
        mostra_funcionarios(e);
    }

    // Método que recebe objeto como parâmetro
    public void mostra_funcionarios(Ficha_funcionarios f) { 
        System.out.println("Nome: " + f.nome + "\nIdade: " + f.idade + "\nProfissão: "
        + f.profissão + "\nSalário: " + f.salário);
    }

    // Método sem parâmetros que retorna String
    public String mostra_funcionarios() {
        return ("Nome: " + nome + "\nIdade: " + idade + "\nProfissão: "
        + profissão + "\nSalário: " + salário);
    }
}