package aularevisao;

import java.awt.Graphics;

class QuadradoOver extends FiguraOver {
    private int lado;

    public void setLado(int lado) { 
        this.lado = lado; 
    }

    @Override
    void desenhar(Graphics g, int x, int y) {
        g.drawRect(x, y, x + lado, y + lado);
    }

    @Override
    float calcularArea() {
        return lado * lado;
    }
}