package faculdade_18_08;

import javax.swing.JOptionPane;
public class Livraria {
    String editora;
    String autor;
    String livro;
    int quantidade;
    double preco;
    int anoPublicacao; //Novo atributo

    public void Informa_Livros(int codigo) {

        switch(codigo){

            case 1: JOptionPane.showMessageDialog(null,"CATEGORIA ROMANCE \n" +
                     "\n LIVRO: " + livro +
                     "\n EDITORA: " + editora +
                     "\n AUTOR: " + autor +
                     "\n ANO DE PUBLICAÇÃO: " + anoPublicacao +   //exibindo novo atributo
                     "\n QUANTIDADE: " + quantidade +
                     "\n PREÇO R$ " + preco,"", JOptionPane.PLAIN_MESSAGE); break;

            case 2: JOptionPane.showMessageDialog(null,"CATEGORIA ESPÍRITA \n" +
                     "\n LIVRO: " + livro +
                     "\n EDITORA: " + editora +
                     "\n AUTOR: " + autor +
                     "\n ANO DE PUBLICAÇÃO: " + anoPublicacao +
                     "\n QUANTIDADE: " + quantidade +
                     "\n PREÇO R$ " + preco,"", JOptionPane.PLAIN_MESSAGE); break;

            case 3: JOptionPane.showMessageDialog(null,"CATEGORIA INFORMÁTICA \n" +
                     "\n LIVRO: " + livro +
                     "\n EDITORA: " + editora +
                     "\n AUTOR: " + autor +
                     "\n ANO DE PUBLICAÇÃO: " + anoPublicacao +
                     "\n QUANTIDADE: " + quantidade +
                     "\n PREÇO R$ " + preco,"", JOptionPane.PLAIN_MESSAGE); break;

            default: System.out.println("código não corresponde a nenhuma categoria de livro");
        }
    }
}
