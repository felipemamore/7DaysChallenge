package desafio;

import java.util.Scanner;

public class Dia2 {
//	
//	Write a Java method to count all vowels in a string. Go to the editor
//	Test Data:
//	Input the string: w3resource
//	Expected Output:
//
//	Number of  Vowels in the string: 4
	

	public static void main(String[] args) {
		String string = new String();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite sua string :");
		string = s.nextLine();
		
		System.out.printf("Qtde de vogais na string: %d", contaVogais(string));
		

	}
	
	public static Integer contaVogais(String stringg) {
		int contadorVogais = 0;
		for (int i = 0; i < stringg.length(); i++) {
			char j = stringg.charAt(i);
			if(j == 'a'|| j == 'e'||j == 'i'|| j== 'o'|| j == 'u') {
				contadorVogais++;
			}
			
		}
		return contadorVogais;
		
	}

}
