package campeonato;

public class Campeonato {

    public static void main(String[] args) {

        Time t1 = new TimeSerieC("Operário-PR");
        Time t2 = new TimeSerieC("São José-RS");
        Time t3 = new TimeSerieC("Ypiranga-RS");

        // Resultados das partidas simuladas
        t1.registrarVitoria(); // Operário ganhou
        t2.registrarEmpate();  // São José empatou
        t3.registrarDerrota(); // Ypiranga perdeu

        t1.registrarEmpate();
        t2.registrarVitoria();
        t3.registrarDerrota();

        // Tabela final
        System.out.println("=== Tabela Final Série C ===");
        System.out.println(t1.getNome() + " - " + t1.getPontos() + " pontos");
        System.out.println(t2.getNome() + " - " + t2.getPontos() + " pontos");
        System.out.println(t3.getNome() + " - " + t3.getPontos() + " pontos");
    }
}
