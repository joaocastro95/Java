package business;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    public void miar() {
        System.out.println(nome + ": Miau!");
    }

    @Override
    public void brincar() {
        System.out.println(nome + " gosta de brincar com novelo de lã!");
    }
}