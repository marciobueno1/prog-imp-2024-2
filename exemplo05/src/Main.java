public class Main {
    public static final int TAM = 16;

    public static void main(String[] args) {
        int[] binario1 = new int[TAM];
        int[] binario2 = new int[TAM];
        int[] binarioSoma = new int[TAM];
        int num1 = 61323;
        int num2 = 29371;
        preencherVetorBinario(binario1, num1);
        System.out.printf("num1 = 61323 = ");
        imprimirVetor(binario1);
        preencherVetorBinario(binario2, num2);
        System.out.printf("num2 = 29371 = ");
        imprimirVetor(binario2);
        somarVetor1(binario1, binario2, binarioSoma);
        System.out.printf("        soma = ");
        imprimirVetor(binarioSoma);
        int verificacao = num1 + num2;
        int[] binarioVerificacao = new int[TAM];
        preencherVetorBinario(binarioVerificacao, verificacao);
        System.out.printf(" verificacao = ");
        imprimirVetor(binarioVerificacao);
    }

    public static void preencherVetorBinario(int[] vetor, int num) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            vetor[i] = num % 2;
            num /= 2;
        }
        if (num != 0) {
            System.out.println("Erro: não deu para representar " + num);
        }
    }

    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void somarVetor1(int[] vetor1, int[] vetor2, int[] vetorSoma) {
        int soma, vai1 = 0, valorAtual = 0;
        for (int i = vetor1.length - 1; i >= 0; --i) {
            soma = vetor1[i] + vetor2[i] + vai1;
//            if (soma == 0) { valorAtual = 0; vai1 = 0; }
//            else if (soma == 1) { valorAtual = 1; vai1 = 0; }
//            else if (soma == 2) { valorAtual = 0; vai1 = 1; }
//            else if (soma == 3) { valorAtual = 1; vai1 = 1; }
            valorAtual = soma % 2;
            vai1 = soma / 2;
            vetorSoma[i] = valorAtual;
        }
        if (vai1 == 1) {
            System.out.println("Soma não coube no vetor!");
        }
    }
}