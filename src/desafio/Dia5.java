package desafio;

import java.util.Scanner;

public class Dia5 {

	public static void main(String[] args) {
//		Write a Java method to find the smallest number among three numbers. Go to the editor
//		Test Data:
//		Input the first number: 25
//		Input the Second number: 37
//		Input the third number: 29
//		Expected Output:
//
//		The smallest value is 25.0
		
		Scanner s = new Scanner(System.in);
		
		Integer n1, n2, n3;
		
		System.out.println("Numero 1: ");
		n1 = Integer.valueOf(s.nextLine());
		System.out.println("Numero 2: ");
		n2 = Integer.valueOf(s.nextLine());
		System.out.println("Numero 3: ");
		n3 = Integer.valueOf(s.nextLine());
		
		System.out.printf("Menor dos 3: %d", encontraMenor(n1, n2, n3));

	}
	
	public static Integer encontraMenor(Integer n1, Integer n2, Integer n3) {
		Integer menor = n1;
		
		if(menor >n2) {
			menor = n2;
		}
		if (menor > n3) {
			menor = n3;
		}
		
		return menor;
		
		
	}

}
