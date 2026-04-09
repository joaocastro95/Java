package negocio;

public abstract class Calculo implements ICalculo {
    protected double valor1;
    protected double valor2;
    protected double resultado;

    public Calculo(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getResultado() {
        return resultado;
    }
}