package poli;

public class Concessionária_Ford extends Oficina_Mecânica {

    Concessionária_Ford() {
        set_marca("Ford");
        set_modelo("Belina");
    }
	
    public String pintura() {
        return "Pintura em bege, tradicional da Ford Belina.";
    }

    public String funilaria() {
        return "Trocar portas e revisar o capô da Belina.";
    }

    public String elétrica() {
        return "Instalar faróis e revisar o painel elétrico da Belina.";
    }
}
