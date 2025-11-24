package tratamento_erros;

public class Equacao_Segundo_Grau {

    private int a, b, c;

    public Equacao_Segundo_Grau(int a, int b, int c) throws Exception {
        this.a = a;
        this.b = b;
        this.c = c;

        resolver();
    }

    private void resolver() throws Exception {
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            throw new Exception("A equação possui raízes complexas! (Delta < 0)");
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
