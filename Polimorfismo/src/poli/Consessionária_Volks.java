package poli;

public class Consessionária_Volks extends Oficina_Mecânica {
	
    Consessionária_Volks() {
        set_marca("Volkswagen");
        set_modelo("Fusca");
    }
	
    public String pintura() {
        return "Pintura azul celeste, típica do Volkswagen Fusca.";
    }

    public String funilaria() {
        return "Revisar a lataria arredondada e alinhar para-lamas do Fusca.";
    }

    public String elétrica() {
        return "Instalar sistema de ignição e lanternas traseiras do Fusca.";
    }

}
