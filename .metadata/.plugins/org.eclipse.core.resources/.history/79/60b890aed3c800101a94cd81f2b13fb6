package poli;

import javax.swing.JOptionPane;

public class App_Oficina {

    public static void main(String[] args) {

        Oficina_Mecânica carro = null;
        Ordem_Serviço ordem = new Ordem_Serviço();

        // ESCOLHA DA MARCA
        int marcaEscolhida = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Escolha o veículo:\n1 - Volkswagen Fusca\n2 - Ford Belina"));

        switch (marcaEscolhida) {
            case 1:
                carro = new Concessionária_Volks();
                break;

            case 2:
                carro = new Concessionária_Ford();
                break;

            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!");
                System.exit(0);
        }

        // ESCOLHA DO SERVIÇO
        int servico = Integer.parseInt(
            JOptionPane.showInputDialog(
                "Escolha o serviço:\n1 - Pintura\n2 - Funilaria\n3 - Elétrica"));

        // EXECUTAR O SERVIÇO (POLIMORFISMO!)
        ordem.executarServico(carro, servico);
    }
}
