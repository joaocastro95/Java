package Organiza_Cidade;

public class Prefeitura {
    public static void main(String args[]){
        Regiao_de_Santos r = new Regiao_de_Santos();
        Bairro_de_Santos b = new Bairro_de_Santos();
        Cidade_de_Santos c = new Cidade_de_Santos();
        Logradouros l = new Logradouros();
        
        /* nova parte — classe Logradouros */
        l.setTipo_logradouro("Avenida");
        l.setLocal_logradouro("Ana Costa");
        l.setBairro("Gonzaga");
        l.setRegiao("Zona Central");
        l.setPopulacao(150000);

        System.out.println("TIPO DE LOGRADOURO: " + l.getTipo_logradouro());
        System.out.println("LOCAL DO LOGRADOURO: " + l.getLocal_logradouro());
        System.out.println("BAIRRO: " + l.getBairro());
        System.out.println("REGIÃO: " + l.getRegiao());
        System.out.println("POPULAÇÃO: " + l.getPopulacao());
        
        System.out.println("---------------------" );
        

        /* classe de hierarquia mais inferior dá acesso a todos os atributos */
        b.setBairro("Jardim Radio Clube");
        b.setRegiao("Zona Noroeste");
        b.setRua("Álvaro Guimarães");
        b.setPopulacao(100000);
        System.out.println("BAIRRO: " + b.getBairro());
        System.out.println("REGIAO: " + b.getRegiao());
        System.out.println("RUA: " + b.getRua());
        System.out.println("POPULACAO: " + b.getPopulacao());
        
        System.out.println("---------------------" );

        /* não dá acesso aos atributos da classe inferior */
        r.setRegiao("Zona Leste");
        r.setBairro("Marapé");
        r.setPopulacao(99000);
        System.out.println("BAIRRO: " + r.getBairro());
        System.out.println("REGIAO: " + r.getRegiao());
        System.out.println("POPULACAO: " + r.getPopulacao());

        c.setRegiao("Região Central");
        c.setPopulacao(20000);
        System.out.println("REGIAO: " + c.getRegiao());
        System.out.println("POPULACAO: " + c.getPopulacao());
    }
}