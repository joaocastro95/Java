package faculdade_01_09;

public class Automóvel {
    private String marca;
    private String modelo;
    private String cor;
    private double preço;

    Automóvel (String marca, String modelo, String cor, double preço) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preço = preço;
    }

    String dados;

    public String mostra_Automóvel() {
        dados = "MARCA:\t" + marca + "\n" + 
                "MODELO:\t" + modelo + "\n" + 
                "COR:\t" + cor + "\n" + 
                "PREÇO R$ " + preço;
        return dados;
    }
}
