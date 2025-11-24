package poli;

import javax.swing.JOptionPane;

public class AplicacaoOficina {

	public static void main(String[] args) {
		Oficina_Mecânica oficina = null;
        Ordem_Serviço ordem = new Ordem_Serviço(); // Instância da Ordem_Serviço

        int tipo_veiculo = Integer.parseInt(JOptionPane.showInputDialog(
            "Digitar o tipo de veículo:" + "\n" + 
            "1 = VOLKSWAGEN" + "\n" +
            "2 = FORD" + "\n" +
            "3 = OFICINA GERAL"
        ));
        
        switch(tipo_veiculo) {
        case 1:
            oficina = new Consessionária_Volks();
            break;
        case 2:
            oficina = new Concessionária_Ford(); 
            break;
        case 3:
            oficina = new Oficina_Mecânica(); 
            break;
        default:
            JOptionPane.showMessageDialog(null, "VEÍCULO INDEFINIDO");
            System.exit(0);
    }

        // Menu de serviços usando Ordem_Serviço
        int tipo_servico = Integer.parseInt(JOptionPane.showInputDialog(
            "Digitar o tipo de serviço para " + oficina.get_marca() + " " + oficina.get_modelo() + ":" + "\n" + 
            "1 = PINTURA" + "\n" +
            "2 = FUNILARIA" + "\n" +
            "3 = ELÉTRICA"
        ));  
        

        String resultado = "";
        switch(tipo_servico) {
            case 1:
                resultado = ordem.executarServicoPintura(oficina); // Usando Ordem_Serviço
                break;
            case 2:
                resultado = ordem.executarServicoFunilaria(oficina); // Usando Ordem_Serviço
                break;
            case 3:
                resultado = ordem.executarServicoEletrica(oficina); // Usando Ordem_Serviço
                break;
            default:
                JOptionPane.showMessageDialog(null, "SERVIÇO INDEFINIDO");
                System.exit(0);
        }
        
        JOptionPane.showMessageDialog(null, 
            "Serviço executado:\n" + resultado +
            "\n\nVeículo: " + oficina.get_marca() + " " + oficina.get_modelo() +
            "\nExecutado através da Ordem de Serviço");
	}
}
