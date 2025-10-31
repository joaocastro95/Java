package faculdade_18_08;

import javax.swing.JOptionPane;

public class Concessionaria {
    public static void main (String args[]) {

        Automovel e = new Automovel();

        String mr, md, pr, cr;
        double pc;

        mr = JOptionPane.showInputDialog("digite a marca:");
        md = JOptionPane.showInputDialog("digite o modelo:");
        cr = JOptionPane.showInputDialog("digite a cor:");
        pr = JOptionPane.showInputDialog("digite o preço:");

        pc = Double.parseDouble(pr);

        e.marca = mr;
        e.modelo = md;
        e.cor = cr;
        e.preco = pc;

        e.Informa_Automovel();
    }
}
