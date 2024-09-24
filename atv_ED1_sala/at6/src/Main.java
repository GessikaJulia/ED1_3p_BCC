import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            queue.add(random.nextInt(1000) + 1);
            queue.add(-(random.nextInt(1000) + 1));
        }

        System.out.println("Fila original: " + queue);

        System.out.println("\nProcessamento:");
        while (!queue.isEmpty()) {
            int number = queue.poll();

            if (number > 0) {
                stack.push(number);
                System.out.println("Empilhado: " + number);
            } else {
                if (!stack.isEmpty()) {
                    int top = stack.pop();
                    System.out.println("Desempilhado: " + top);
                } else {
                    System.out.println("Pilha vazia, não há nada para desempilhar.");
                }
            }
        }

        System.out.println("\nPilha final (deveria estar vazia): " + stack);
    }
}
