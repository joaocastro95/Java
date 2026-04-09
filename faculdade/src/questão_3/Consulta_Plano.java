package questão_3;

public class Consulta_Plano {
	
	public static void main (String[] args) {
		
		// 5. Criar variáveis de instância usando o método construtor com valores
        System.out.println("=== VALORES INICIALIZADOS PELO CONSTRUTOR ===");
        Plano_De_Ensino a = new Plano_De_Ensino(
            "Programação Orientada a Objetos",
            "Introdução à POO, Classes e Objetos, Herança, Polimorfismo",
            "Provas teóricas e trabalhos práticos",
            "Java: Como Programar - Deitel"
        );
        
        // 6. Retornar valores usando métodos gets()
        System.out.println("Matéria: " + a.getMateria());
        System.out.println("Conteúdo Programático: " + a.getConteudoProgramatico());
        System.out.println("Critério de Avaliação: " + a.getCriterioAvaliacao());
        System.out.println("Bibliografia: " + a.getBibliografia());
        
        
        System.out.println("\n=== VALORES INSERIDOS PELOS MÉTODOS SETS() ===");
        
        // 5. Criar variável de instância usando construtor padrão
        Plano_De_Ensino b = new Plano_De_Ensino();
        
        // Inserir valores pelos métodos sets()
        b.setMateria("Banco de Dados");
        b.setConteudoProgramatico("Modelo Relacional, SQL, Normalização");
        b.setCriterioAvaliacao("Provas e projeto de banco de dados");
        b.setBibliografia("Sistemas de Banco de Dados - Elmasri");
        
        // 6. Retornar valores usando métodos gets()
        System.out.println("Matéria: " + b.getMateria());
        System.out.println("Conteúdo Programático: " + b.getConteudoProgramatico());
        System.out.println("Critério de Avaliação: " + b.getCriterioAvaliacao());
        System.out.println("Bibliografia: " + b.getBibliografia());
        
        System.out.println("\n=== DEMONSTRAÇÃO COMPLETA ===");
        // Mostrando todos os dados dos dois planos
        System.out.println("PLANO 1:");
        exibirPlano(a);
        
        System.out.println("\nPLANO 2:");
        exibirPlano(b);
    }
    
    // Método auxiliar para exibir os dados de um plano
    public static void exibirPlano(Plano_De_Ensino plano) {
        System.out.println("• Matéria: " + plano.getMateria());
        System.out.println("• Conteúdo: " + plano.getConteudoProgramatico());
        System.out.println("• Avaliação: " + plano.getCriterioAvaliacao());
        System.out.println("• Bibliografia: " + plano.getBibliografia());
	}

}
