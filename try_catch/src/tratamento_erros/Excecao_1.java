package tratamento_erros;

public class Excecao_1 {
    
    static int p = 0;
    
    public static int divide(int dividendo, int divisor) {
        try {
            p = dividendo / divisor;
        } 
        catch (ArithmeticException a) {
            System.err.println("Erro: " + a);
        }
        
        return p;
    }
    
    public static void main(String[] args) {
        int c = 0;
        int b = 1;
        System.out.println("Resultado = " + divide(b, c));
    }
}
