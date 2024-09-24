import java.util.Stack;

public class Remover{
    public static boolean removerNome(Stack<String> pilha, String chave) {
        Stack<String> aux = new Stack<>();
        boolean encontrado = false;

        while (!pilha.isEmpty()) {
            String nome = pilha.pop();
            if (nome.equals(chave)) {
                encontrado = true;
                break;
            }
            aux.push(nome);
        }

        while (!aux.isEmpty()) {
            pilha.push(aux.pop());
        }

        return encontrado;
    }
}