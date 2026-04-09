package model;

public class Subtracao extends Calculo {

    @Override
    public void calcular() {
        resultado = getValor1() - getValor2();
    }
}