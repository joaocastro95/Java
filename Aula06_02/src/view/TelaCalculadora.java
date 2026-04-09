package view;

import javax.swing.*;
import negocio.*;

public class TelaCalculadora extends JFrame {

    private JTextField txtValor1, txtValor2;
    private JLabel lblResultado;

    public TelaCalculadora() {
        setTitle("Calculadora");
        setSize(300, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbl1 = new JLabel("Valor 1:");
        lbl1.setBounds(20, 20, 80, 25);
        add(lbl1);

        txtValor1 = new JTextField();
        txtValor1.setBounds(100, 20, 150, 25);
        add(txtValor1);

        JLabel lbl2 = new JLabel("Valor 2:");
        lbl2.setBounds(20, 60, 80, 25);
        add(lbl2);

        txtValor2 = new JTextField();
        txtValor2.setBounds(100, 60, 150, 25);
        add(txtValor2);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(20, 100, 200, 25);
        add(lblResultado);

        JButton btnSoma = new JButton("+");
        btnSoma.setBounds(20, 140, 50, 30);
        add(btnSoma);

        JButton btnSub = new JButton("-");
        btnSub.setBounds(80, 140, 50, 30);
        add(btnSub);

        JButton btnMult = new JButton("*");
        btnMult.setBounds(140, 140, 50, 30);
        add(btnMult);

        JButton btnDiv = new JButton("/");
        btnDiv.setBounds(200, 140, 50, 30);
        add(btnDiv);

        // Eventos
        btnSoma.addActionListener(e -> calcular(new Adicao(getV1(), getV2())));
        btnSub.addActionListener(e -> calcular(new Subtracao(getV1(), getV2())));
        btnMult.addActionListener(e -> calcular(new Multiplicacao(getV1(), getV2())));
        btnDiv.addActionListener(e -> calcular(new Divisao(getV1(), getV2())));
    }

    private double getV1() {
        return Double.parseDouble(txtValor1.getText());
    }

    private double getV2() {
        return Double.parseDouble(txtValor2.getText());
    }

    private void calcular(Calculo c) {
        c.calcular();
        lblResultado.setText("Resultado: " + c.getResultado());
    }
}