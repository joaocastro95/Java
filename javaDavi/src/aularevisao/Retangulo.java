package aularevisao;

import java.awt.Graphics;

public class Retangulo extends FiguraOver{
	private int base, altura;
	public void setBase(int base) {this.base = base;}
	public void setAltura (int altura) {this.altura = altura;}
	
	@Override
	void desenhar(Graphics g, int x, int y) {
		g.drawRect(x, y, x + base,  y+ altura);
	}
	
	@Override
	float calcularArea() {
		return base * altura;
	}

}
