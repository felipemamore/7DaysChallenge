import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String novaString;
        Scanner s = new Scanner(System.in);

        System.out.println("Digite seu texto: ");
        novaString = s.nextLine();

        System.out.printf("Quantidade de vogais: %d", contaVogais(novaString));
       
    }
    public static int contaVogais(String palavra) {
        int contVogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char vogal = palavra.charAt(i);
        
            if(vogal == 'a' || vogal == 'e' || vogal == 'i' || vogal == 'o' || vogal == 'u'){
                contVogais++;

            }
            
        }
        return contVogais;
            
    }
}
