package Cinemas;

public class Cine_Miramar extends Cinemas_do_Shopping {

    Cine_Miramar() {
        setShopping("Miramar Shopping");
        setlocalização("Rua Euclides da Cunha - Gonzaga");
        setQuantidadeSalas(6);

        System.out.println("Cine Miramar no " + getShopping());
        System.out.println("Localização: " + getlocalização());
        System.out.println("Salas: " + getQuantidadeSalas() + "\n");
    }
}