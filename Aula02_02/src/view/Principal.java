package view;

import business.Cachorro;
import business.Gato;

public class Principal {
    public static void main(String[] args) {

        // Cachorros
        Cachorro c1 = new Cachorro("Rex");
        c1.setPeso(10.5);
        c1.setIdade(3);

        Cachorro c2 = new Cachorro("Thor");
        c2.setPeso(12.0);
        c2.setIdade(5);

        // Gatos
        Gato g1 = new Gato("Mimi");
        g1.setPeso(4.2);
        g1.setIdade(2);

        Gato g2 = new Gato("Luna");
        g2.setPeso(3.8);
        g2.setIdade(1);

        // Simulando o "playground"
        System.out.println("=== PLAYGROUND PET ===");

        c1.exibirInfo();
        c1.latir();
        c1.brincar();

        System.out.println();

        c2.exibirInfo();
        c2.latir();
        c2.brincar();

        System.out.println();

        g1.exibirInfo();
        g1.miar();
        g1.brincar();

        System.out.println();

        g2.exibirInfo();
        g2.miar();
        g2.brincar();
    }
}