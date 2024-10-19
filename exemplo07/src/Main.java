import java.util.Scanner;

public class Main {
    public static final Scanner ler = new Scanner(System.in);
    public static final int TAM = 5;

    public static void main(String[] args) {
        int[] vetor1 = new int[TAM];
        int[] vetor2 = new int[TAM];
        int[] vetorResult = new int[TAM];
        int opcao;
        do {
            System.out.println("MENU");
            System.out.println("1 - Preencher Vetores");
            System.out.println("2 - Imprimir Vetores");
            System.out.println("3 - Buscar Valor");
            System.out.println("4 - Vetor Inverso");
            System.out.println("5 - Vetor Soma");
            System.out.println("6 - Vetor Pares e Ímpares");
            System.out.print("Digite sua opção (0 para sair): ");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite valores para o vetor 1");
                    preencher(vetor1);
                    System.out.println("Digite valores para o vetor 2");
                    preencher(vetor2);
                    break;
                case 2:
                    System.out.print("vetor1 = ");
                    imprimir(vetor1);
                    System.out.print("vetor2 = ");
                    imprimir(vetor2);
                    break;
                case 3:
                    System.out.println("Busca no Vetor 1");
                    opcaoBuscar(vetor1);
                    break;
                case 4:
                    gerarResultInverso(vetor1, vetorResult);
                    System.out.print("vetorResult = ");
                    imprimir(vetorResult);
                    break;
                case 5:
                    gerarResultSoma(vetor1, vetor2, vetorResult);
                    System.out.print("vetorResult = ");
                    imprimir(vetorResult);
                    break;
                case 6:
                    gerarResultImparPar(vetor1, vetor2, vetorResult);
                    System.out.print("vetorResult = ");
                    imprimir(vetorResult);
                    break;
                default:
                    if (opcao != 0) {
                        System.out.println("Opção Inválida!");
                    }
            }
        } while (opcao != 0);
        System.out.println("Fim da execução!");
    }

    public static void preencher(int[] v) {
        for (int i = 0; i < v.length; ++i) {
            System.out.printf("Digite v[%d]: ", i);
            v[i] = ler.nextInt();
        }
    }

    public static void imprimir(int[] v) {
        System.out.print("{");
        if (v.length != 0) {
            System.out.print(" " + v[0]);
            for (int i = 1; i < v.length; ++i) {
                System.out.print(", " + v[i]);
            }
        }
        System.out.println(" }");
    }

    public static int buscar(int[] v, int tam, int valor) {
        for (int i = 0; i < tam; ++i) {
            if (v[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public static void opcaoBuscar(int v[]) {
        int valor, pos;
        System.out.print("Digite o valor para ser buscado: ");
        valor = ler.nextInt();
        pos = buscar(v, v.length, valor);
        if (pos != -1) {
            System.out.printf("Valor encontrado na posição %d\n", pos);
        } else {
            System.out.println("Valor não encontrado no vetor!");
        }
    }

    public static void gerarResultInverso(int[] vetor1, int[] vetorResult) {
        for (int i = 0; i < vetor1.length; ++i) {
            vetorResult[vetor1.length - 1 - i] = vetor1[i];
        }
    }

    public static void gerarResultSoma(int[] vetor1, int[] vetor2, int[] vetorResult) {
        for (int i = 0; i < vetor1.length; ++i) {
            vetorResult[i] = vetor1[i] + vetor2[i];
        }
    }

    public static void gerarResultImparPar(int[] vetor1, int[] vetor2, int[] vetorResult) {
        int j = 0;
        for (int i = 0; i < vetor1.length; ++i) {
            if (vetor1[i] % 2 != 0) {
                vetorResult[j] = vetor1[i];
                ++j;
            }
        }
        if (j < vetorResult.length) {
            for (int i = 0; i < vetor2.length; ++i) {
                if (vetor2[i] % 2 == 0) {
                    vetorResult[j] = vetor2[i];
                    ++j;
                    if (j >= vetor2.length) {
                        break;
                    }
                }
            }
        }
    }
}