import java.util.Scanner;

public class Main {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int idade;
        System.out.print("Digite sua idade: ");
        idade = ler.nextInt();
        System.out.println("Sua idade é " + idade);

        if (idade >= 70) {
            System.out.println("Você não é mais obrigado a votar!");
        } else if (idade >= 18) {
            System.out.println("Você é obrigado a votar!");
        } else if (idade >= 16) {
            System.out.println("Você já pode votar, mas, não é obrigado!");
        } else {
            System.out.println("Você ainda não pode votar!");
        }
    }
}