import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[1000];
        Random random = new Random();

        System.out.println("Vetor de números gerados:");
        for (int i = 0; i < 1000; i++) {
            vetor[i] = random.nextInt(19999) - 9999;
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        ListaCircularDuplamenteEncadeada lista = new ListaCircularDuplamenteEncadeada();

        for (int i = 0; i < 1000; i++) {
            lista.inserirOrdenado(vetor[i]);
        }

        System.out.println("Lista em ordem crescente:");
        lista.imprimirCrescente();
        System.out.println();

        System.out.println("Lista em ordem decrescente:");
        lista.imprimirDecrescente();
        System.out.println();

        lista.removerPrimos();
        System.out.println("Lista após remover números primos (ordem crescente):");
        lista.imprimirCrescente();
    }
}
