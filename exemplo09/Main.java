package exemplo09;

public class Main {
  public static void main(String[] args) {
    String msg = "Olá Mundo!";
    char caractere = msg.charAt(4);
    System.out.println("caractere = " + caractere);
    System.out.println("string = " + msg);
    System.out.println("Tamanho da string: " + msg.length());
    char[] vetorCaracteres = msg.toCharArray();
    System.out.println("caractere = " + vetorCaracteres[4]);
    vetorCaracteres[4] = 'm';
    String novaMsg = new String(vetorCaracteres);
    System.out.println("nova msg = " + novaMsg);
    imprimir(vetorCaracteres);
    imprimir(msg);
  }

  public static void imprimir(char[] v) {
    for (int i = 0; i < v.length; ++i) {
      System.out.print("'" + v[i] + "' ");
    }
    System.out.println();
  }

  public static void imprimir(String msg) {
    for (int i = 0; i < msg.length(); ++i) {
      System.out.print("'" + msg.charAt(i) + "' ");
    }
    System.out.println();
  }
}
