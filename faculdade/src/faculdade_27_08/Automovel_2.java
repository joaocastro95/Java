package faculdade_27_08;

public class Automovel_2 {

    private String marca;
    private String modelo;
    private String cor;
    private double preco;
    
    // Métodos SET (para modificar os atributos)
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Métodos GET (para acessar os atributos)
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public void Informa_Automovel() {

        System.out.println("MARCA:  " + marca);
        System.out.println("MODELO: " + modelo);
        System.out.println("COR:    " + cor);
        System.out.println("PREÇO:  " + preco);
    }
}
