package faculdade_01_09;

public class Revendedora1 {

    public static void main (String args[]) {

        Automovel_constructor A = new Automovel_constructor();
        A.mostracarro();

        Automovel_constructor B = new Automovel_constructor(1977, "Volkswagen", "Fusca", 3888.00);
        B.mostracarro();

    }
}