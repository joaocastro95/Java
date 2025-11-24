package entities;

public class Retangulo {
	
	public double width;
	public double height;
	
	public double area() {
		double result = width*height;
		return result;
	}
	
	public double perimeter() {
		double result = 2 * (width + height);
		return result;
		}
		public double diagonal() {
		return Math.sqrt(width * width + height * height);
		}
	
}

