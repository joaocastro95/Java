package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

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
        lblNome.setBounds(50, 30, 80, 25);
        
        // 🔥 Fonte maior + cor azul
        lblNome.setFont(new Font("Arial", Font.BOLD, 16));
        lblNome.setForeground(Color.BLUE);
        
        painelDeConteudo.add(lblNome);
        
        // JTextField
        txtNome = new JTextField();
        txtNome.setBounds(100, 30, 300, 25);
        
        // 🔥 Fonte maior
        txtNome.setFont(new Font("Arial", Font.PLAIN, 16));
        
        painelDeConteudo.add(txtNome);
        
        // JButton
        btnEnviarDados = new JButton("Enviar");
        btnEnviarDados.setBounds(140, 100, 200, 30);
        
        // 🔥 Evento (ActionListener)
        btnEnviarDados.addActionListener(e -> {
            String nome = txtNome.getText();
            JOptionPane.showMessageDialog(null, "Nome digitado: " + nome);
        });
        
        painelDeConteudo.add(btnEnviarDados);
        
        frmPrincipal.setVisible(true);
    }
}