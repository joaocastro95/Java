package Figura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sistema de Figuras Geométricas ===");
        System.out.println("Escolha a figura:");
        System.out.println("1 - Retângulo");
        System.out.println("2 - Quadrado");
        System.out.println("3 - Figura genérica");

        int opcao = sc.nextInt();

        Figuras figura = null;

        switch(opcao) {
            case 1:
                figura = new Retangulo("Criando um Retângulo...");
                System.out.print("Digite lado A: ");
                double a = sc.nextDouble();
                System.out.print("Digite lado B: ");
                double b = sc.nextDouble();
                ((Retangulo) figura).setLado_a(a);
                ((Retangulo) figura).setLado_b(b);
                break;

            case 2:
                figura = new Quadrado("Criando um Quadrado...");
                System.out.print("Digite o lado: ");
                double l = sc.nextDouble();
                ((Quadrado) figura).setLado_a(l);
                ((Quadrado) figura).setLado_c(l);
                break;

            case 3:
                figura = new Figuras("Criando figura genérica...");
                break;

            default:
                System.out.println("Opção inválida.");
                System.exit(0);
        }

        System.out.println("\nÁrea calculada: " + figura.dimensao());
        sc.close();
    }
}
