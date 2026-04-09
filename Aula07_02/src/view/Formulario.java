package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import business.Adicao;
import business.Calculo;

public class Formulario {

	private JFrame frmCalculadora;
	private JLabel lblValor1, lblValor2, lblResultado;
	private JTextField txtValor1, txtValor2;
	private JButton btnSomar, btnSubtrair, btnMultiplicar, btnDividir;

	Calculo calc = null;
	
	public Formulario() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
	
		frmCalculadora = new JFrame("Calculadora com OOP e Swing");
		frmCalculadora.setBounds(500, 350, 450, 250);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.setLayout(null);
		Container painel = frmCalculadora.getContentPane();

		lblValor1 = new JLabel("Valor 1:");
		lblValor1.setBounds(50, 40, 50, 25);
		painel.add(lblValor1);
		
		txtValor1 = new JTextField();
		txtValor1.setBounds(110, 40, 70, 25);
		painel.add(txtValor1);
		
		lblValor2 = new JLabel("Valor 2:");
		lblValor2.setBounds(50, 80, 50, 25);
		painel.add(lblValor2);
		
		txtValor2 = new JTextField();
		txtValor2.setBounds(110, 80, 70, 25);
		painel.add(txtValor2);
		
		lblResultado = new JLabel("Resultado:");
		lblResultado.setBounds(150, 130, 150, 40);
		lblResultado.setForeground(Color.BLUE);
		lblResultado.setFont(new Font("Arial", Font.BOLD, 14));
		painel.add(lblResultado);
		
		btnSomar = new JButton("+");
		btnSomar.setBounds(250, 35, 50, 30);
		btnSomar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (validarPreenchimento()) {
					float v1 = Float.parseFloat(txtValor1.getText());
					float v2 = Float.parseFloat(txtValor2.getText());
					calc = new Adicao(v1, v2);
					executarCalculo(calc);
					exibirResultado(calc);
				}
				
			}
		});
		painel.add(btnSomar);
		
		btnSubtrair = new JButton("-");
		btnSubtrair.setBounds(330, 35, 50, 30);
		painel.add(btnSubtrair);
		
		btnMultiplicar = new JButton("x");
		btnMultiplicar.setBounds(250, 80, 50, 30);
		painel.add(btnMultiplicar);
		
		btnDividir = new JButton("/");
		btnDividir.setBounds(330, 80, 50, 30);
		painel.add(btnDividir);
		
		
		
		frmCalculadora.setVisible(true);
		
	}
	
	protected void executarCalculo(Calculo calc2) {
		calc.calcular();
	}

	protected void exibirResultado(Calculo calc) {
		lblResultado.setText(String.format("Resultado: %.2f", calc.getResultado()));
	}

	private boolean validarPreenchimento() {
		return (txtValor1.getText().length() > 0 && 
				txtValor2.getText().length() > 0);
	}
}


