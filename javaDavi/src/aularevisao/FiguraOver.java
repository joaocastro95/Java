package aularevisao;

import java.awt.Graphics;

abstract class FiguraOver implements ICalculo, IGrafico {
}

class Quadrado extends FiguraOver {
    private int lado;
    
    public void setLado(int lado) { this.lado = lado; }
    
    @Override
    public void desenhar(Graphics g, int x, int y) {
        g.drawRect(x, y, x + lado, y + lado);
    }
    
    @Override
    public float calcularArea() {
        return lado * lado;
    }
    
    @Override
    public float calcularPerimetro() {
        return (lado + lado) * 2;
    }
}