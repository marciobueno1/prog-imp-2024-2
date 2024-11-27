package exemplo13_questao10;

public class Pessoa {
    String nome;
    String endereco;
    int telefone;

    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, int telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String toString() {
        return this.nome + " - " + this.telefone + " - " + this.endereco;
    }
}
