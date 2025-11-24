package Figura;

public class Quadrado extends Figuras {

    Quadrado(String mensagem){
        super(mensagem);
    }

    @Override
    public double dimensao() {
        return getLado_a() * getLado_a();
    }
}
