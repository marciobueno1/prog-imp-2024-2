import java.util.Scanner;

public class Main {
  public static Scanner ler = new Scanner(System.in);
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa("Maria", 25, 55.8, 1.69);
    Pessoa p2 = new Pessoa("José", 28, 70.5, 1.57);
    Pessoa p3 = lerPessoa();

    imprimir(p1);
    imprimir(p2);
    imprimir(p3);
  }
  
  public static void imprimir(Pessoa p) {
    System.out.printf("{ %s, idade = %d, peso = %.2f, alt = %.2f }\n",
        p.nome, p.idade, p.peso, p.altura);
  }
  
  public static Pessoa lerPessoa() {
    Pessoa p = new Pessoa();
    System.out.print("Digite o nome da pessoa: ");
    p.nome = ler.nextLine();
    System.out.print("Digite a idade da pessoa: ");
    p.idade = ler.nextInt();
    System.out.print("Digite o peso da pessoa: ");
    p.peso = ler.nextDouble();
    System.out.print("Digite a altura da pessoa: ");
    p.altura = ler.nextDouble();
    return p;
  }

    public static Pessoa lerPessoaV2() {
    System.out.print("Digite o nome da pessoa: ");
    String nome = ler.nextLine();
    System.out.print("Digite a idade da pessoa: ");
    int idade = ler.nextInt();
    System.out.print("Digite o peso da pessoa: ");
    double peso = ler.nextDouble();
    System.out.print("Digite a altura da pessoa: ");
    double altura = ler.nextDouble();
    return new Pessoa(nome, idade, peso, altura);
  }
}