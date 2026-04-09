package negocio;

public class Adicao extends Calculo {

    public Adicao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    @Override
    public void calcular() {
        resultado = valor1 + valor2;
    }
}