package encapsulamento_2;

import faculdade_27_08.Acesso_Numeros;

public class Verifica_Encapsulamento_2 {
public static void main (String args[]) {
	
	Acesso_Numeros chave = new Acesso_Numeros();
	
	/*chave.a = 10; PACKAGEPRIVARE NÃO PERMITE ACESSO FORA DO PACOTE */
	chave.setNumero("a", 10);
	chave.b = 20;
	//chave.C = 30; Não é possivel acessar variavel private
	chave.setNumero("c",30);
	/*chave.d= 40; NÃO É POSSIVEL ACESSAR PROTECTED DIRETAMENTE DE FORA DO PACOTE */
	chave.setNumero("d", 40);
	
	chave.mostra_numero();
}
	

}
