package heranca;

public class Conceito_Herança {

    public static void main(String args[]) {

        Classe_Filha_2 a = new Classe_Filha_2();

        a.set_atributo_1("valor do atributo 1");
        a.set_atributo_2("valor do atributo 2");
        a.set_atributo_3("valor do atributo 3");
        System.out.println(a.get_atributo_1());
        System.out.println(a.get_atributo_2());
        System.out.println(a.get_atributo_3());
    }
}
