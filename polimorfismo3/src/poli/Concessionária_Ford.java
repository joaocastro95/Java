package poli;

public class Concessionária_Ford extends Oficina_Mecânica {

    public Concessionária_Ford() {
        set_marca("Ford");
        set_modelo("Belina");
    }

    @Override
    public String pintura() {
        return "pintura bege típica da Belina";
    }

    @Override
    public String funilaria() {
        return "reparo estrutural da Belina";
    }

    @Override
    public String elétrica() {
        return "ajuste no sistema elétrico da Belina";
    }
}
