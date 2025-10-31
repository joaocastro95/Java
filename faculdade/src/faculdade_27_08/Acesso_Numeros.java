package faculdade_27_08;

public class Acesso_Numeros {

	int a;              // padrão (package-private) -> só acessível dentro do mesmo pacote
	public int b;       // público -> acessível de qualquer lugar
	private int c;      // privado -> acessível apenas dentro da própria classe
	protected int d;    // protegido -> acessível no mesmo pacote e em subclasses

    public void setNumero(String id, int numero){
        if (id == "a")
            this.a = numero;

        if (id == "c")
            this.c = numero;

        if (id == "d")
            this.d = numero;
    }

    public void mostra_numero(){
        System.out.println("numero a = " + a);
        System.out.println("numero b = " + b);
        System.out.println("numero c = " + c);
        System.out.println("numero d = " + d);
    }
}