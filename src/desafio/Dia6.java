package desafio;

import java.util.Scanner;

public class Dia6 {
//	. Write a Java program to get a number from the user and print whether it is positive or negative. Go to the editor
//
//	Test Data
//	Input number: 35
//	Expected Output :
//	Number is positive

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

		System.out.println("Informe um valor: ");

		int valor = Integer.valueOf(s.nextLine());
		if (valor < 0) {

			System.out.println("O valor é Negativo! ");
		
		} else {

			System.out.println("O valor é Positivo! ");
		}

	}
	
		
		
		
	}
	
	


