package questão_1;

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
        g = JOptionPane.showInputDialog(null,"ano de publicação");
        e = JOptionPane.showInputDialog(null,"quantidade");
        f = JOptionPane.showInputDialog(null,"preço");

        h = Integer.parseInt(a);
        ano = Integer.parseInt(g);
        i = Double.parseDouble(f);

        // Usando os métodos set() para atribuir valores
        cultura.setEditora(b);
        cultura.setAutor(c);
        cultura.setLivro(d);
        cultura.setAnoPublicacao(ano);
        cultura.setQuantidade(Integer.parseInt(e));
        cultura.setPreco(i);

        cultura.Informa_Livros(h);
    }
}