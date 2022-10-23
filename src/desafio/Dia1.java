package desafio;

import java.util.Scanner;



public class Dia1 {

	public static void main(String[] args) {
		Double n1, n2, n3;
		Scanner s = new Scanner(System.in);
		
		System.out.println("valor 1");
		n1 = Double.valueOf(s.nextLine());
		System.out.println("valor 2");
		n2 = Double.valueOf(s.nextLine());
		System.out.println("valor 3");
		n3 = Double.valueOf(s.nextLine());
		
		System.out.printf("media de %.1f + %.1f + %.1f = %.1f", n1, n2, n3, media(n1, n2, n3));
		s.close();
		

	}
	public static Double media(double n1, double n2, double n3) {
		return (n1+n2+n3)/3;
		
	}

}
