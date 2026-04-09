package model;

public abstract class Calculo implements ICalculo {
	private float valor1;
	private float valor2;
	protected float resultado;
	
    // getters e setters
    public float getValor1() { return valor1; }
    public void setValor1(float valor1) { this.valor1 = valor1; }

    public float getValor2() { return valor2; }
    public void setValor2(float valor2) { this.valor2 = valor2; }

    public float getResultado() { return resultado; }

}
