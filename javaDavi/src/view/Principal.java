package view;

import business.Pessoa;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoal = new Pessoa("Fatec", 31, 10, 1986);

        System.out.println("Nome: " + pessoal.getNome());
        System.out.println("Nasc.: " + pessoal.getNascimento().getData());
    }
}