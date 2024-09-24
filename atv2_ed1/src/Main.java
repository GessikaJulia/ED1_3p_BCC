import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilhaPar = new Pilha();
        Pilha pilhaImpar = new Pilha();

        System.out.println("Digite valores inteiros entre -127 e 128 (0 para finalizar):");
        while (true) {
            int valor = scanner.nextInt();
            if (valor == 0) {
                break;
            }
            if (valor % 2 == 0) {
                pilhaPar.empilhar(valor);
            } else {
                pilhaImpar.empilhar(valor);
            }
        }

        System.out.println("Desempilhando alternadamente, começando pela PILHA ÍMPAR:");
        while (!pilhaImpar.estaVazia() && !pilhaPar.estaVazia()) {
            System.out.println("Desempilhando da PILHA ÍMPAR: " + pilhaImpar.desempilhar());
            if (!pilhaPar.estaVazia()) {
                System.out.println("Desempilhando da PILHA PAR: " + pilhaPar.desempilhar());
            }
        }

        if (!pilhaImpar.estaVazia()) {
            System.out.println("PILHA ÍMPAR ainda possui " + pilhaImpar.contarElementos() + " elementos:");
            pilhaImpar.mostrarElementos();
        } else if (!pilhaPar.estaVazia()) {
            System.out.println("PILHA PAR ainda possui " + pilhaPar.contarElementos() + " elementos:");
            pilhaPar.mostrarElementos();
        } else {
            System.out.println("Ambas as pilhas estão vazias.");
        }

        scanner.close();
    }
}