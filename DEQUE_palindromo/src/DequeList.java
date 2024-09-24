import java.util.LinkedList;

public class DequeList {
    private LinkedList<Character> deque;

    public DequeList() {
        deque = new LinkedList<>();
    }

    public void inserirFrente(char valor) {
        deque.addFirst(valor);
    }

    public void inserirFim(char valor) {
        deque.addLast(valor);
    }

    public char removerFrente() {
        if (deque.isEmpty()) {
            System.out.println("DEQUE VAZIO");
            return '\0';
        }
        return deque.removeFirst();
    }

    public char removerFim() {
        if (deque.isEmpty()) {
            System.out.println("DEQUE VAZIO");
            return '\0';
        }
        return deque.removeLast();
    }

    public boolean estaVazio() {
        return deque.isEmpty();
    }

    public void mostrarDeque() {
        if (estaVazio()) {
            System.out.println("DEQUE VAZIO");
            return;
        }
        System.out.print("Elementos no DEQUE: ");
        for (char c : deque) {
            System.out.print(c + " ");
        }
        System.out.println();
    }
}
