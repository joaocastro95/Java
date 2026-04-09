package business;

public abstract class Animal {
    protected String nome;
    protected double peso;
    protected int idade;

    public Animal(String nome) {
        this.nome = nome;
    }

    // getters e setters
    public String getNome() { return nome; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    // método abstrato
    public abstract void brincar();

    // exibir info
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Idade: " + idade);
    }
}