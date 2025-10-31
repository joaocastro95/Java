package faculdade_27_08;

import javax.swing.JOptionPane;

public class Concessionaria_2 {
    public static void main (String args[]) {

        Automovel_2 e = new Automovel_2();

        String mr, md, pr, cr;
        double pc;

        mr = JOptionPane.showInputDialog("digite a marca:");
        md = JOptionPane.showInputDialog("digite o modelo:");
        cr = JOptionPane.showInputDialog("digite a cor:");
        pr = JOptionPane.showInputDialog("digite o preço:");

        pc = Double.parseDouble(pr);

        e.setMarca(mr);
        e.setModelo(md);
        e.setCor(cr);
        e.setPreco(pc);

        e.Informa_Automovel();
    }
}
