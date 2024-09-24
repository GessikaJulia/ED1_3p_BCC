import java.util.Stack;

public class Inverter {
    public static Stack<Integer> inverterPilha(Stack<Integer> pilha) {
        Stack<Integer> pilhaInvertida = new Stack<>();
        while (!pilha.isEmpty()) {
            pilhaInvertida.push(pilha.pop());
        }
        return pilhaInvertida;
    }
}