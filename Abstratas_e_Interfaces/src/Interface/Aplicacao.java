package Interface;

public class Aplicacao {
    public static void main(String[] args) {

        Métodos m = new ImplementaMétodos();

        int resultado = m.Soma(10, 25);
        String texto = m.Palavra("Interface em Java");

        System.out.println("Resultado da soma = " + resultado);
        System.out.println(texto);
    }
}
