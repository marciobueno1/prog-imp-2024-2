package exemplo13_questao10;

import java.util.Scanner;

public class Main {
    public static final int QTD_PESSOAS = 4;
    public static final Scanner ler = new Scanner(System.in);
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[QTD_PESSOAS];
        int tamPessoas = 0;
        int opcao;
        do {
            System.out.println("\n\nMENU");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Listar Pessoas");
            System.out.println("3 - Buscar Telefone");
            System.out.println("4 - Buscar Nome");
            System.out.println("5 - Ordenar por telefone");
            System.out.println("6 - Ordenar por nome");
            System.out.println("0 - Sair");
            System.out.print("Digite a sua opção: ");
            opcao = ler.nextInt();
            ler.nextLine();
            switch (opcao) {
                case 1:
                    tamPessoas = cadastrarPessoa(pessoas, tamPessoas);
                    break;

                case 2:
                    listarPessoas(pessoas, tamPessoas);
                    break;

                case 3:
                    buscarTelefone(pessoas, tamPessoas);
                    break;

                case 4:
                    buscarNome(pessoas, tamPessoas);
                    break;

                case 5:
                    insercaoDiretaTelefone(pessoas, tamPessoas);
                    break;

                case 6:
                    insercaoDiretaNome(pessoas, tamPessoas);
                    break;

                    case 0:
                    System.out.println("\n\nEncerrando o programa!");
                    break;
            
                default:
                    System.out.println("\n\nOpção inválida!");
                    break;
            }
        } while (opcao != 0);
    }

    public static int cadastrarPessoa(Pessoa[] vp, int tam) {
        if (tam == vp.length) {
            System.out.println("\n\nVetor cheio! Não é possível mais cadastrar ninguém!");
            return tam;
        }

        System.out.println("\n\nEntre com as informações da pessoa " + (tam + 1));
        vp[tam] = lerPessoa();
        return tam + 1;
    }

    public static void listarPessoas(Pessoa[] vp, int tam) {
        System.out.println("\n\nListagem de Pessoas");
        for (int i = 0; i < tam; ++i) {
            System.out.println(vp[i]);
        }
    }

    public static Pessoa lerPessoa() {
        System.out.print("Digite o nome: ");
        String nome = ler.nextLine();
        System.out.print("Digite o telefone: ");
        int telefone = ler.nextInt();
        ler.nextLine();
        System.out.print("Digite o endereço: ");
        String endereco = ler.nextLine();
        return new Pessoa(nome, endereco, telefone);
    }

    public static void buscarTelefone(Pessoa[] vp, int tam) {
        System.out.print("Digite o telefone para a busca: ");
        int tel = ler.nextInt();
        ler.nextLine();
        int indiceBusca = buscarTelefone(vp, tam, tel);
        if (indiceBusca != -1) {
            System.out.println(vp[indiceBusca]);
        } else {
            System.out.println("Telefone " + tel + " não encontrado!");
        }
    }

    public static int buscarTelefone(Pessoa[] vp, int tam, int tel) {
        for (int i = 0; i < tam; ++i) {
            if (vp[i].telefone == tel) {
                return i;
            }
        }
        return -1;
    }

    public static void buscarNome(Pessoa[] vp, int tam) {
        System.out.print("Digite o nome para a busca: ");
        String nome = ler.nextLine();
        int indiceBusca = buscarNome(vp, tam, nome);
        if (indiceBusca != -1) {
            System.out.println(vp[indiceBusca]);
        } else {
            System.out.println("Nome " + nome + " não encontrado!");
        }
    }

    public static int buscarNome(Pessoa[] vp, int tam, String nome) {
        for (int i = 0; i < tam; ++i) {
            if (vp[i].nome.equals(nome)) { // IMPORTANTE: Não pode utilizar ==
                return i;
            }
        }
        return -1;
    }

    public static void insercaoDiretaTelefone(Pessoa[] vp, int n) {
        int i, j;
        Pessoa aux;
        for (i = 1; i <= n - 1; i++) {
            aux = vp[i];
            j = i - 1;
            while (j >= 0 && vp[j].telefone > aux.telefone) {
                vp[j+1] = vp[j];
                j = j - 1;
            }
            vp[j+1] = aux;
        }
    }

    public static void insercaoDiretaNome(Pessoa[] vp, int n) {
        int i, j;
        Pessoa aux;
        for (i = 1; i <= n - 1; i++) {
            aux = vp[i];
            j = i - 1;
            while (j >= 0 && vp[j].nome.compareTo(aux.nome) > 0) { // IMPORTANTE: Não pode utilizar apenas o >
                vp[j+1] = vp[j];
                j = j - 1;
            }
            vp[j+1] = aux;
        }
    }
}
