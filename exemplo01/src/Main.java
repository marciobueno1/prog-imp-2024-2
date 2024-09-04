import java.util.Scanner;

public class Main {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // imprimeLiterais();
        // leituraDados();
        estatisticas();
    }

    public static void imprimeLiterais() {
        int num1 = 10;
        double num2 = 3.14;
        double num3 = num1 * num2;
        char letra1 = 'a';
        String nome = "Maria";
        boolean ehValido = true;

        System.out.print(num1 + "\n");
        System.out.println(num2);
        System.out.printf("%.2f\n", num3);
        System.out.println(letra1);
        System.out.println(nome);
        System.out.println(ehValido);
    }

    public static void leituraDados() {
        int idade;

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.println("A idade digitada é " + idade);

        if (idade < 18) {
            System.out.println("Você é menor de idade");
        } else {
            System.out.println("Você é maior de idade");
        }

        if (idade < 18) {
            System.out.println("Você é menor de idade");
        }
        if (idade % 5 == 0){
            System.out.println("Sua idade é múltiplo de 5");
        }

        if (idade < 13) {
            System.out.println("Você é uma criança");
        } else if (idade < 18) {
            System.out.println("Você é um adolescente");
        } else if (idade < 65) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }
    }

    public static void estatisticas() {
        int num, soma = 0, qtd = 0;
        double media;
        System.out.print("Digite um número inteiro: ");
        num = entrada.nextInt();
        while (num > 0) {
            soma += num;
            qtd += 1;
            System.out.print("Digite um número inteiro: ");
            num = entrada.nextInt();
        }
        System.out.println("Encerrada a digitação!");
        System.out.println("Somatório = " + soma);
        System.out.println("Quantidade de números digitados = " + qtd);
        if (qtd != 0) {
            media = (double) soma / (double) qtd;
            System.out.println("A média dos elementos digitados = " + media);
        } else {
            System.out.println("Nenhum número digitado para poder calcular a média!");
        }
    }
}