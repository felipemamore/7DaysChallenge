import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       // Write a Java method to find the smallest number among three numbers.
      //Test Data:
     //Input the first number: 25
    //Input the Second number: 37
   //Input the third number: 29

        Double n1, n2, n3;
        Scanner n = new Scanner(System.in);

        System.out.println("Primeiro numero: "  );
        n1 = Double.valueOf(n.nextLine());
        System.out.println("Segundo numero: ");
        n2 = Double.valueOf(n.nextLine());
        System.out.println("Terceiro numero: ");
        n3 = Double.valueOf(n.nextLine());
        

        System.out.printf("menor numero: %f ", Double.valueOf(menorNumero(n1, n2, n3)));

    }

    public static Double menorNumero(Double n1, Double n2, Double n3) {
        Double menor;

        if (n1 < n2) {
            if (n3 < n1) {
                menor = n3;
            } else {
                menor = n1;
            }
        } else {
            if (n2 < n3) {
                menor = n2;
            } else {
                menor = n3;
            }

        }

        return menor;

     }
}
