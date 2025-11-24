package cursoProgramacao;

public class FuncoesInterassantes {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG     ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2,4);
		String s05 = original.replace('a','X');
		String s06 = original.replace("abc","xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");

		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring: -" + s04 + "-");
		System.out.println("replace: -" + s05 + "-");
		System.out.println("replace2: -" + s06 + "-");
		System.out.println("Index: -" + i + "-");
		System.out.println("Last Index: -" + j + "-");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
	}

}


// Formatar: toLowerCase(), toUpperCase(),trim()
// recortar: substring(inicio), substring(inicio,fim)
// substituir: Replace(char, char), Replace(string, string)
// Buscar: IndexOf, LastIndexOf
// str.Split("")