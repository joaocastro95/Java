package aularevisao;

class Data {
    int dia, mes, ano;
    public Data() {
    	dia = mes = ano = 0;
    }
    
    public Data(int dia, int mes, int ano) {
    	this.dia = dia;
    	this.mes = mes;
    	this.ano = ano;
    }

    String retornarInfo() {
        return String.format("Data: %d/%d/%d", dia, mes, ano);
    }
}

class Horario {
    int hora, minuto, segundo;

    String retornarInfo() {
        return String.format("Hora: %d:%d:%d", hora, minuto, segundo);
    }
}

public class Principal {
    public static void main(String[] args) {
        Data data = new Data();
        data.ano = 2025;
        data.mes = 12;
        data.dia = 31;

        Horario horario = new Horario();
        horario.hora = 23;
        horario.minuto = 59;
        horario.segundo = 59;

        System.out.println(data.retornarInfo());
        Data data2 = new Data(31,12,2029);
        System.out.println(data2.retornarInfo());
    }
}