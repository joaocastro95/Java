package Figuras_geometricas;

public class Calcula_areas {
	public static void main (String args[]) { 
		figuras_geometricas u = new figuras_geometricas ();
		System.out.println("Area do retângulo " + u.getArea (u.getLado_a(),u.getLado_b()));
		System.out.println("Area do quadrado " + u.getArea());
		u.setLado_a (4.0);
		System.out.println("Area do retângulo " + u.getArea (u.getLado_a(),u.getLado_b()));
		System.out.println("Area do quadrado " + u.getArea());
	}

}
