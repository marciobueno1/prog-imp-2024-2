import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String nome;
        System.out.print("Digite o seu nome: ");
        nome = entrada.nextLine();
        System.out.println("Olá, " + nome + "!");
        System.out.printf("Olá, %s!%n", nome);

        imprimirPrimos();
    }

    public static boolean primo(int n) {
        return false;
    }

    public static void imprimirPrimos() {
        System.out.print("Números primos entre 1 e 1000: ");
        for (int num = 1; num <= 1000; num++) {
            if (primo(num)) {
                System.out.print(num + ", ");
            }
        }
    }
}
