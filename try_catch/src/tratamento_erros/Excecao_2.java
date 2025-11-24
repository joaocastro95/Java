package tratamento_erros;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Excecao_2 extends JFrame implements ActionListener {

    JButton B1, B2, B3;
    JTextArea TA1;

    public Excecao_2() {

        // ---- CONFIGURA A JANELA ----
        setTitle("Tratamento de Arquivos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // ---- ÁREA DE TEXTO ----
        TA1 = new JTextArea();
        TA1.setBounds(20, 20, 340, 150);
        add(TA1);

        // ---- BOTÃO GRAVAR ----
        B1 = new JButton("Gravar");
        B1.setBounds(20, 190, 90, 30);
        B1.addActionListener(this);
        add(B1);

        // ---- BOTÃO LER ----
        B2 = new JButton("Ler");
        B2.setBounds(150, 190, 90, 30);
        B2.addActionListener(this);
        add(B2);

        // ---- BOTÃO LIMPAR ----
        B3 = new JButton("Limpar");
        B3.setBounds(270, 190, 90, 30);
        B3.addActionListener(this);
        add(B3);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String arquivo = "c:/arq1.txt";

        // LIMPAR
        if (e.getSource() == B3) {
            TA1.setText("");
        }

        // GRAVAR
        if (e.getSource() == B1) {
            try {
                String S = TA1.getText();
                byte b[] = S.getBytes();

                FileOutputStream grava = new FileOutputStream(arquivo);
                grava.write(b);
                grava.close();
            } catch (IOException ex) {
                System.out.println("erro para gravar");
            }
        }

        // LER
        if (e.getSource() == B2) {
            try {
                FileInputStream ler = new FileInputStream(arquivo);
                byte bt[] = new byte[10240];
                ler.read(bt);
                String S = new String(bt);
                TA1.setText(S);
                ler.close();
            } catch (IOException ex) {
                System.out.println("erro para ler");
            }
        }
    }

    // ---- MÉTODO PRINCIPAL PRA RODAR ----
    public static void main(String[] args) {
        new Excecao_2();
    }
}
