package Abstrata_e_Interface_feira;

public class Simula_Feira {
    public static void main(String[] args) {

        Feira a = new Fruta();
        a.set_fruta(a.comprar);
        a.chama_comprar_fruta();
        
        Feira b = new Verdura();
        b.set_verdura(b.comprar);
        b.chama_comprar_verdura();

        // Novo comportamento: Fiscalizar
        Feira fiscal = new Fiscal_da_feira();
        fiscal.chama_fiscalizar();
    }
}
