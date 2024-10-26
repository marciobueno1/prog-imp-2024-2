import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] v = new int[30];
        preencher(v);
        System.out.println("Antes da ordenação");
        imprimir(v);
        // insertionSort(v, v.length);
        selectionSort(v, v.length);
        bubbleSort(v, v.length);
        System.out.println("Após a ordenação");
        imprimir(v);
    }

    public static void preencher(int v[]) {
        Random gerador = new Random();
        for (int i = 0; i < v.length; ++i) {
            v[i] = gerador.nextInt(100) + 1;
        }
    }

    public static void insertionSort(int v[], int tam) {
        for (int i = 1; i < tam; ++i) {
            int tmp = v[i];
            int j = i - 1;
            while (j >= 0 && tmp < v[j]) {
                v[j + 1] = v[j];
                j = j - 1;
            }
            v[j + 1] = tmp;
        }
    }

    public static void selectionSort(int[] v, int tam) {	
    	for (int i = 0; i < tam - 1; i++) {	
            int i_menor = i;
            for (int j = i + 1; j < tam; j++) {
                if (v[j] < v[i_menor]) {
                    i_menor = j;
                }
            }
            int aux = v[i];
            v[i] = v[i_menor];
            v[i_menor] = aux;
        }		
    }

    public static void bubbleSort (int[] v, int tam) {
        int fim = tam - 2, pos = 0;
        boolean trocou = true;
        while (trocou) {
            trocou = false;
            for (int i = 0; i <= fim; i++) {
                if (v[i] > v[i+1]) {
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i+1] = aux;
                    pos = i;
                    trocou = true;
                }
            }
            fim = pos-1;
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
}