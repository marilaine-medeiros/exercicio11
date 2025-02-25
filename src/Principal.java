import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = 0;
        int i = 1;


        while (i <= 20) {
            System.out.println(" Digite o " + i + "° número: ");
            int numero = scanner.nextInt();

            if (numero > 8) {
                quantidade++;
            }
            i++;
        }


        System.out.println("Quantidade de números maiores que 8: " + quantidade);

        scanner.close();
    }
}