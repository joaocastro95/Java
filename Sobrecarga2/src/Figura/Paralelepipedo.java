package Figura;

public class Paralelepipedo extends Figuras {

    Paralelepipedo(String mensagem) {
        super(mensagem);
    }

    @Override
    public double dimensao() {
        return getLado_a() * getLado_b() * getLado_c();
    }
}
