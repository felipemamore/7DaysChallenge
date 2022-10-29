package desafio;

import java.util.Scanner;

public class Dia7 {

	public static void main(String[] args) {
		String string;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite as palavras da string");
		string = s.nextLine();
		
		System.out.printf("Qtde de palavras: %d", contaPalavra(string));

	}
	
	public static Integer contaPalavra(String str) {
		String[] palavra = str.split("\\s+");
		return palavra.length;
	}

}
