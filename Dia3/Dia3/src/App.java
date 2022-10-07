import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Double n1, n2, n3;
        Scanner n = new Scanner(System.in);

        System.out.println("Primeiro numero: ");
        n1 = Double.valueOf(n.nextLine());
        System.out.println("Segundo numero: ");
        n2 = Double.valueOf(n.nextLine());
        System.out.println("Terceiro numero: ");
        n3 = Double.valueOf(n.nextLine());
        n.close();

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
