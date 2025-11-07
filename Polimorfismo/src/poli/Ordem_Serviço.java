package poli;

public class Ordem_Serviço {
	
    public String executarServicoPintura(Oficina_Mecânica oficina) {
        return oficina.pintura();
    }
    
    public String executarServicoFunilaria(Oficina_Mecânica oficina) {
        return oficina.funilaria();
    }
    
    public String executarServicoEletrica(Oficina_Mecânica oficina) {
        return oficina.elétrica();
    }

}
