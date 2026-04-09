package faculdade_01_09;

public class Automovel_constructor {

    private int ano;
    private String marca;
    private String modelo;
    private static String cor;
    private double preco;

    //método construtor
    Automovel_constructor () {}

    //método construtor
    Automovel_constructor (int ano, String marca, String modelo, double preco) {
        this.ano = ano;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    static {
        cor = "verde";
    }

    public void mostracarro () {
        System.out.println("\n" + "carro marca:" + "\t" + marca + "\n"
        + "modelo:" + "\t" + modelo + "\n"
        + "ano:" + "\t" + ano + "\n"
        + "cor:" + "\t" + cor + "\n"
        + "preco:" + "\t" + preco);
    }
}
