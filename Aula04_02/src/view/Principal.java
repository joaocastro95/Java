package view;

import java.util.Scanner;

import model.Adicao;
import model.Calculo;
import model.Divisao;
import model.Multiplicacao;
import model.Subtracao;

public class Principal {

	public static void main(String[] args) {
		// apresenta cabeçalho
		System.out.println("** Calculadora com POO **\n");
		// exibe opções de operações para o usuário
		System.out.println("Selecione a operação desejada:\n" +
				"1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
		// instancia objeto para receber escolha do usuário
		Scanner entrada = new Scanner(System.in);
		// lê entrada do usuário
		int operacao = entrada.nextInt();

		// recebe valores do usuário
		System.out.print("Valor 1: ");
		float v1 = entrada.nextFloat();
		System.out.print("Valor 2: ");
		float v2 = entrada.nextFloat();
		
		// declara objeto da classe pai (para poder receber instâncias das filhas)
		Calculo calc = null;
		
		switch(operacao) {
			case 1: calc = new Adicao(v1, v2); break;
			case 2: calc = new Subtracao(v1, v2); break;
			case 3: calc = new Multiplicacao(v1, v2); break;
			case 4: calc = new Divisao(v1, v2); break;
		}

		// executa o método de cálculo de acordo com a instância da filha recebida
		calc.calcular();
		System.out.println(String.format("Resultado: %.2f", calc.getResultado()));
		
	}

}
