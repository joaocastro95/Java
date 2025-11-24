package tratamento_erros;

public class TestaEquacao {

    public static void main(String[] args) {

        // CASO 1 — NÃO gera exceção
        System.out.println("Equação 1:");
        try {
            new Equacao_Segundo_Grau(1, -3, 2);  // Delta = 1 → raízes reais
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // CASO 2 — GERA exceção
        System.out.println("\nEquação 2:");
        try {
            new Equacao_Segundo_Grau(1, 2, 5);  // Delta < 0 → erro
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
