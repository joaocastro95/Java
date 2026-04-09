package negocio;

public class Subtracao extends Calculo {

    public Subtracao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    @Override
    public void calcular() {
        resultado = valor1 - valor2;
    }
}