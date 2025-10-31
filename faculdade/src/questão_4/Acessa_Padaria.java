package questão_4;

public class Acessa_Padaria {
	
    public static void main(String[] args) {
        System.out.println("=== PADARIA CASEIRA ===");
        Padaria_Caseira a = new Padaria_Caseira("Padoca do Zé", "Rua das Flores, 123", 
                                                "Lenha", true);
        a.exibirInfo();
        
        System.out.println("\n=== PADARIA INDUSTRIAL ===");
        Padaria_Industrial b = new Padaria_Industrial("Pão Quente Ind.", 
                                                           "Av. Industrial, 456", 15, true);
        b.exibirInfo();
        
        System.out.println("\n=== USANDO MÉTODOS SETS E GETS ===");
        Padaria_Caseira c = new Padaria_Caseira();
        c.setNome("Padaria Nova");
        c.setEndereco("Rua Nova, 789");
        c.setTipoForno("Elétrico");
        c.setArtesanal(false);
        
        System.out.println("Nome: " + c.getNome());
        System.out.println("Tipo de Forno: " + c.getTipoForno());
        System.out.println("Artesanal: " + c.isArtesanal());
    }
}
