package Interface;

public class ImplementaMétodos implements Métodos {

    @Override
    public int Soma(int a, int b) {
        return a + b;
    }

    @Override
    public String Palavra(String c) {
        return "Você digitou: " + c;
    }
}
