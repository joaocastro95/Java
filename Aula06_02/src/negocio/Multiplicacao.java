package negocio;

public class Multiplicacao extends Calculo {

    public Multiplicacao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    @Override
    public void calcular() {
        resultado = valor1 * valor2;
    }
}