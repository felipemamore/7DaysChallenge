package desafio;

import java.util.Scanner;

public class Dia2 {
	

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
