package faculdade_18_08;

import javax.swing.JOptionPane;
public class Atendente_Livraria {

    public static void main(String args[]){

        Livraria cultura = new Livraria();

        String a, b, c, d, e, f, g;
        int h, ano;
        double i;

        JOptionPane.showMessageDialog(null,"Categorias: digite 1 para Romance \n 2 para Espírita \n 3 para Informática");
        a = JOptionPane.showInputDialog(null,"código");
        b = JOptionPane.showInputDialog(null,"editora");
        c = JOptionPane.showInputDialog(null,"autor");
        d = JOptionPane.showInputDialog(null,"livro");
        g = JOptionPane.showInputDialog(null,"ano de publicação"); // novo input
        e = JOptionPane.showInputDialog(null,"quantidade");
        f = JOptionPane.showInputDialog(null,"preço");

        h = Integer.parseInt(a);
        ano = Integer.parseInt(g);
        i = Double.parseDouble(f);

        cultura.editora = b;
        cultura.autor = c;
        cultura.livro = d;
        cultura.anoPublicacao = ano; // armazenando
        cultura.quantidade = Integer.parseInt(e);
        cultura.preco = i;

        cultura.Informa_Livros(h);
    }
}