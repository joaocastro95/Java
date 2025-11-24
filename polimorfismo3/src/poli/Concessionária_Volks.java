package poli;

public class Concessionária_Volks extends Oficina_Mecânica {

    public Concessionária_Volks() {
        set_marca("Volkswagen");
        set_modelo("Fusca");
    }

    @Override
    public String pintura() {
        return "pintura azul do Fusca";
    }

    @Override
    public String funilaria() {
        return "reparo na lataria arredondada do Fusca";
    }

    @Override
    public String elétrica() {
        return "instala sistema elétrico do Fusca";
    }
}
