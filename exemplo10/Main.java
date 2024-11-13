public class Main {
  public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    p1.nome = "Maria";
    p1.idade = 25;
    p1.peso = 55.8;
    p1.altura = 1.69;

    Pessoa p2 = new Pessoa();
    p2.nome = "José";
    p2.idade = 28;
    p2.peso = 70.5;
    p2.altura = 1.57;

    Pessoa p3 = p2;
    p3.nome = "João";

    imprimir(p1);
    imprimir(p2);
    imprimir(p3);
  }
  
  public static void imprimir(Pessoa p) {
    System.out.printf("{ %s, idade = %d, peso = %.2f, alt = %.2f }\n",
        p.nome, p.idade, p.peso, p.altura
    );
  }
}