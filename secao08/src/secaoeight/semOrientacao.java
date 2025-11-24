package secaoeight;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class semOrientacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Digite os lados do primeiro triangulo: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os lados do Segundo triangulo: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangulo X área: %.4f%n", areaX);
		System.out.printf("Triangulo Y área: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.printf("Triangulo X é maior");
		}
		else {
			System.out.printf("Triangulo Y é maior");
		}
		sc.close();
	}

}
