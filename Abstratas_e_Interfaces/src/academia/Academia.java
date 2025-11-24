package academia;

public class Academia {

    public static void main(String[] args) {

        Atividade a1 = new Musculacao("Fernanda", 40);
        Atividade a2 = new Pilates("João", 50);

        System.out.println("=== Musculação ===");
        a1.mostrarInfos();
        System.out.println("Calorias gastas: " + a1.calcularCalorias());

        System.out.println("\n=== Pilates ===");
        a2.mostrarInfos();
        System.out.println("Calorias gastas: " + a2.calcularCalorias());
    }
}
