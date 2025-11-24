package metodos;

import javax.swing.*;

public class funciona_sobrecarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ficha_funcionarios funcionarios = new Ficha_funcionarios(22,2889.09,"Gisele","Pedagoga");
		JOptionPane.showMessageDialog(null, funcionarios.mostra_funcionarios());

		concatena_aplicação();
	}
	
	public static void concatena_aplicação() {
		Acesso_secundário a = new Acesso_secundário();
	}

}
