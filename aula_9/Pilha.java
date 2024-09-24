import java.util.Stack;
import java.util.Scanner;

public class Pilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = sc.nextLine();
        String[] palavras = frase.split(" ");
        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = inverterPalavra(palavras[i]);
        }
        String fraseInvertida = String.join(" ", palavras);
        System.out.println(fraseInvertida);
    }

    private static String inverterPalavra(String palavra) {
        Stack<Character> pilha = new Stack<>();
        for (char letra : palavra.toCharArray()) {
            pilha.push(letra);
        }
        StringBuilder palavraInvertida = new StringBuilder();
        while (!pilha.isEmpty()) {
            palavraInvertida.append(pilha.pop());
        }
        return palavraInvertida.toString();
    }
}