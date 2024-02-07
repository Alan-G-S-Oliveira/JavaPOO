import java.util.Scanner;

public class Teste001 {

    public static void main(String[] args) {
        
        try (Scanner ler = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
            int x = ler.nextInt();

            if(x % 2 == 0)
                System.out.println("É par!");
            else
                System.out.println("É ímpar!");
        }

    }
    
}
