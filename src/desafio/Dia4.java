package desafio;

import java.util.Scanner;

public class Dia4 {
	
//	Write a Java method to compute the sum of the digits in an integer. 
//	Test Data:
//	Input an integer: 25
//	Expected Output:
//
//	The sum is 7

	public static void main(String[] args) {
		Integer n;
		Scanner s = new Scanner(System.in);
		System.out.println("numero: ");
		
		n = Integer.valueOf(s.nextLine());
		
		System.out.printf("A soma é: %d", soma(n));
		
		
		

	}
	
	public static Integer soma(Integer num) {
		int soma = 0;
		
		while(num>0) {
			soma += num%10;
			num/=10;
		}
		return soma;
	}

}
