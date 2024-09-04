import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int num, qtdNumInvalidos = 0;
        System.out.print("Digite um numero positivo: ");
        num = ler.nextInt();

        while (num <= 0) {
            qtdNumInvalidos += 1;
            System.out.println("Número inválido!");
            System.out.print("Digite um numero positivo: ");
            num = ler.nextInt();
        }

        System.out.println("Você digitou o número positivo " + num);
        if (qtdNumInvalidos > 0) {
            System.out.println("Você digitou " + qtdNumInvalidos + " número(s) inválido(s)");
        }
    }
}