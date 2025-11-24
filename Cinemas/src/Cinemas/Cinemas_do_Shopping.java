package Cinemas;

public class Cinemas_do_Shopping extends Cinemas_de_Santos {
	
	private String nome_do_cinema;
	private int numero_de_salas;
	private static boolean cabecalhoImpresso = false;
	
	Cinemas_do_Shopping(String descricao) {
        if (!cabecalhoImpresso) {
            System.out.println("Cinemas modernos em Santos\n");
            cabecalhoImpresso = true;
        }
        System.out.println(descricao);
    }
	
    public void setnome(String nome) {
        this.nome_do_cinema = nome;
    }

    public String getnome() {
        return nome_do_cinema;
    }

    public void setsalas(int numero_de_salas) {
        this.numero_de_salas = numero_de_salas;
    }

    public int getsalas() {
        return numero_de_salas;
    }
}
