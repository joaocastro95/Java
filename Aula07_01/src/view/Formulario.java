package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Formulario {
	
	private JFrame frmPrincipal;
	private JLabel lblNome;
	private JTextField txtNome;
	private JButton btnEnviarDados;

	public Formulario() {
		inicializarComponentes();
	}

	private void inicializarComponentes() {
		
		frmPrincipal = new JFrame("Meu primeiro Swing");
		frmPrincipal.setBounds(400, 200, 500, 250);
		frmPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrincipal.setLayout(null);
		Container painelDeConteudo = frmPrincipal.getContentPane();
		
		// JLabel
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(50, 30, 60, 25);
		lblNome.setFont(new Font("Arial", Font.BOLD, 16)); // fonte maior
		lblNome.setForeground(Color.BLUE); // cor azul
		painelDeConteudo.add(lblNome);
		
		// JTextField
		txtNome = new JTextField();
		txtNome.setBounds(120, 30, 280, 30);
		txtNome.setFont(new Font("Arial", Font.PLAIN, 16)); // fonte maior
		painelDeConteudo.add(txtNome);
		
		// JButton
		btnEnviarDados = new JButton("Enviar");
		btnEnviarDados.setBounds(170, 100, 120, 35);
		
		btnEnviarDados.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				JOptionPane.showMessageDialog(null, nome);
			}
		});
		
		painelDeConteudo.add(btnEnviarDados);

		frmPrincipal.setVisible(true);
	}
}