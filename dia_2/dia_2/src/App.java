import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        //Write a Java program to sum values of an array

        Random random = new Random();
        int array[] = new int[5];
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            array[i]= random.nextInt(10);
            System.out.println(array[i]);
            
        }

        for (int i = 0; i < array.length; i++) {
            soma+=array[i];
            
        }
        System.out.printf("Soma dos elementos do array: %d", soma);


    }
}
