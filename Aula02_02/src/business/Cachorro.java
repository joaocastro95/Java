package business;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println(nome + ": Au au!");
    }

    @Override
    public void brincar() {
        System.out.println(nome + " adora brincar de buscar a bolinha!");
    }
}