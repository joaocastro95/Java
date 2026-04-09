package construtor_herança;

public class Acessa_Papelaria {
	
	public static void main(String [] args) {
		
		//primeiro acesso ao método construtor padrão da papelaria
		
		Papelaria a = new Papelaria();
		a.set_caderno("brochura");
		System.out.println("caderno tipo: " + a.get_caderno());
		
		Papelaria b = new Papelaria("Lápis de cor");
		System.out.println("Lápis tipo: " + b.get_lapis() + "\n");
		
		
		//segundo acesso ao método construtor padrão da Papelaria
		Material_Escolar c = new Material_Escolar();
		
		
		//terceiro acesso ao método construtor padrão da papelaria, provocado automaticamente por causa da herança
		
		Material_Escolar d = new Material_Escolar(33.84, 20);
		System.out.println("preço do caderno R$ " + d.get_preço_caderno());
		System.out.println("quantidade de caixas de lápis de cor: " + d.get_quantidade_caixas_lapis());
		
		
		//quarta classe
		
        Descrição_Material e = new Descrição_Material("tilibra", true, 3);
        System.out.println("Marca do caderno: " + e.get_marca_caderno());
        System.out.println("Lápis colorido? " + e.get_lapis_colorido());
        System.out.println("Quantidade de borrachas: " + e.get_quantidade_borracha());


	}
}
