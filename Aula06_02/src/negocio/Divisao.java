package negocio;

public class Divisao extends Calculo {

    public Divisao(double valor1, double valor2) {
        super(valor1, valor2);
    }

    @Override
    public void calcular() {
        if (valor2 != 0) {
            resultado = valor1 / valor2;
        } else {
            resultado = 0;
            System.out.println("Erro: divisão por zero");
        }
    }
}