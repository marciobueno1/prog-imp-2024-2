import java.util.Scanner;

public class Main {
    public static final int TAM = 6;
    public static final Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        // int[] v1 = new int[TAM];
        // int[] v2 = new int[TAM];
        int[] v1 = { 8, 9, 4, 6, 7, 7 };
        int[] v2 = { 8, 9, 7, 10, 6, 5 };
        double[] medias = new double[TAM];
        System.out.println("Digitação do vetor 1:");
        // preencherTeclado(v1);
        System.out.println("Digitação do vetor 2:");
        // preencherTecladoSemRepeticao(v2);
        gerarMedia(v1, v2, medias);
        double media = calcularMedia(medias);
        imprimir(v1);
        imprimir(v2);
        imprimir(medias);
        System.out.printf("A média da turma é %.2f\n", media);
        for (int i = 0; i < medias.length; ++i) {
            if (medias[i] > media) {
                System.out.printf("Aluno %d ficou acima da média da turma com média %.2f\n",
                        i, medias[i]);
            }
        }
    }

    public static void preencherTeclado(int v[]) {
        for (int i = 0; i < v.length; ++i) {
            System.out.print("Digite vetor[" + i + "]: ");
            v[i] = ler.nextInt();
        }
    }

    public static void preencherTecladoSemRepeticao(int v[]) {
        for (int i = 0; i < v.length; ++i) {
            System.out.print("Digite vetor[" + i + "]: ");
            v[i] = ler.nextInt();
            while (buscar(v, i, v[i]) != -1) {
                System.out.println("Não pode digitar valor repetido!");
                System.out.print("Digite vetor[" + i + "]: ");
                v[i] = ler.nextInt();
            }
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

    public static void imprimir(double[] v) {
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

    public static void gerarMedia(int[] notas1, int[] notas2, double[] medias) {
        for (int i = 0; i < notas1.length; ++i) {
            medias[i] = (notas1[i] * 2.0 + notas2[i] * 3.0) / 5.0;
        }
    }

    public static double calcularMedia(double[] v) {
        double soma = 0.0;
        for (int i = 0; i < v.length; ++i) {
            soma += v[i];
        }
        return soma / v.length;
    }
}

/*

        System.out.print("{ ");
        for (int i = 0; i < v.length; ++i) {
            System.out.print(v[i]);
            if (i == v.length - 1) {
                System.out.print(" ");
            } else {
                System.out.print(", ");
            }
        }
        System.out.print("}");

 */