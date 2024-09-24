import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os nomes da pilha: (encerrar: 1):");
        while (true) {
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("1")) {
                break;
            }
            pilha.push(nome);
        }

        System.out.println("Chave c (remove):");
        String chave = scanner.nextLine();

        System.out.println("Pilha original: " + pilha);


        if (Remover.removerNome(pilha, chave)) {
            System.out.println("Pilha após remover '" + chave + "': " + pilha);
        } else {
            System.out.println("Nome '" + chave + "' removido.");
        }

        scanner.close();
    }
}

