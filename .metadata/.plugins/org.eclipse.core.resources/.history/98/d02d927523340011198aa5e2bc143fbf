package view;

import java.util.Scanner;
import model.*;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int op = sc.nextInt();

        System.out.print("Digite o primeiro valor: ");
        float v1 = sc.nextFloat();

        System.out.print("Digite o segundo valor: ");
        float v2 = sc.nextFloat();

        Calculo calc = null;

        switch (op) {
            case 1:
                calc = new Adicao();
                break;
            case 2:
                calc = new Subtracao();
                break;
            case 3:
                calc = new Multiplicacao();
                break;
            case 4:
                calc = new Divisao();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        calc.setValor1(v1);
        calc.setValor2(v2);
        calc.calcular();

        System.out.println("Resultado: " + calc.getResultado());

        sc.close();
    }
}