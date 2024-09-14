import java.util.Scanner;

public class Main {
    public static int QTD_ALUNOS = 6;
    public static Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        double[] notas = new double[QTD_ALUNOS];
        double somatorio = 0.0, media;
        for (int i = 0; i < QTD_ALUNOS; i++) {
            System.out.printf("Digite a nota do aluno %d: ", i + 1);
            notas[i] = ler.nextDouble();
            somatorio += notas[i];
        }
        media = somatorio / QTD_ALUNOS;
        System.out.printf("Media: %.2f\n", media);
        for (int i = 0; i < QTD_ALUNOS; i++) {
            if (notas[i] > media) {
                System.out.printf("notas[%d] = %.2f\n", i, notas[i]);
            }
        }
        // calcula e imprime a maior nota
        double maior = notas[0];
        for (int i = 1; i < QTD_ALUNOS; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
        }
        System.out.printf("Maior nota = %.2f\n", maior);
        // calcula e imprime a nota mais próxima da média
        System.out.printf("-----------------------------\n");
        for (int i = 0; i < QTD_ALUNOS; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.printf("\n-----------------------------\n");
        double maisProxMedia = notas[0];
        for (int i = 1; i < QTD_ALUNOS; i++) {
            if (Math.abs(media - notas[i]) < Math.abs(media - maisProxMedia)) {
                maisProxMedia = notas[i];
            }
        }
        System.out.printf("Nota mais próxima da média = %.2f\n", maisProxMedia);
        System.out.printf("\n-----------------------------\n");
        int maisProxMediaV2 = 0;
        for (int i = 1; i < QTD_ALUNOS; i++) {
            if (Math.abs(media - notas[i]) < Math.abs(media - notas[maisProxMediaV2])) {
                maisProxMediaV2 = i;
            }
        }
        System.out.printf("Nota mais próxima da média: notas[%d] = %.2f\n",
                maisProxMediaV2, notas[maisProxMediaV2]);
    }
}
