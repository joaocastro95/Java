package questão_1;

import javax.swing.JOptionPane;

public class Livraria {
    private String editora;
    private String autor;
    private String livro;
    private int quantidade;
    private double preco;
    private int anoPublicacao;

    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getEditora() {
        return editora;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setLivro(String livro) {
        this.livro = livro;
    }
    public String getLivro() {
        return livro;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public void Informa_Livros(int codigo) {
        switch(codigo) {
            case 1: 
                JOptionPane.showMessageDialog(null, "CATEGORIA ROMANCE \n" +
                     "\n LIVRO: " + livro +
                     "\n EDITORA: " + editora +
                     "\n AUTOR: " + autor +
                     "\n ANO DE PUBLICAÇÃO: " + anoPublicacao +
                     "\n QUANTIDADE: " + quantidade +
                     "\n PREÇO R$ " + preco, "", JOptionPane.PLAIN_MESSAGE); 
                break;

            case 2: 
                JOptionPane.showMessageDialog(null, "CATEGORIA ESPÍRITA \n" +
                     "\n LIVRO: " + livro +
                     "\n EDITORA: " + editora +
                     "\n AUTOR: " + autor +
                     "\n ANO DE PUBLICAÇÃO: " + anoPublicacao +
                     "\n QUANTIDADE: " + quantidade +
                     "\n PREÇO R$ " + preco, "", JOptionPane.PLAIN_MESSAGE); 
                break;

            case 3: 
                JOptionPane.showMessageDialog(null, "CATEGORIA INFORMÁTICA \n" +
                     "\n LIVRO: " + livro +
                     "\n EDITORA: " + editora +
                     "\n AUTOR: " + autor +
                     "\n ANO DE PUBLICAÇÃO: " + anoPublicacao +
                     "\n QUANTIDADE: " + quantidade +
                     "\n PREÇO R$ " + preco, "", JOptionPane.PLAIN_MESSAGE); 
                break;

            default: 
                System.out.println("Código não corresponde a nenhuma categoria de livro");
        }
    }
}