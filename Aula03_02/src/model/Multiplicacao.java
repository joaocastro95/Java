package model;

public class Multiplicacao extends Calculo {

    @Override
    public void calcular() {
        resultado = getValor1() * getValor2();
    }
}