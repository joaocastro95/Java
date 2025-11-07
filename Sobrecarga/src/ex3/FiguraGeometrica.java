package ex3;

public class FiguraGeometrica {
    private String tipo;
    
    // Construtor da superclasse
    FiguraGeometrica(String tipo) {
        this.tipo = tipo;
        System.out.println("=== " + tipo + " ===");
        System.out.println("Método dimensão() calcula:");
    }
    
    // Método concreto que pode ser sobrescrito
    public String dimensao() {
        return "Método dimensão da superclasse - use as subclasses específicas";
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}