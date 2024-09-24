import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pilha = new Stack<>();
        Random random = new Random();

        for (int i = 1; i <= 100; i++) {
            pilha.push(i);
        }

        System.out.println("Pilha original: " + pilha);

        Stack<Integer> pilhaInvertida = Inverter.inverterPilha(pilha);

        System.out.println("Pilha invertida: " + pilhaInvertida);
    }
}