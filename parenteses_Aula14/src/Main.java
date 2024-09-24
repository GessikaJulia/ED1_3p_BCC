import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pilha pilha = new Pilha();

        System.out.println("Insira a expressão:");
        String expressao = scanner.nextLine();

        if (pilha.verificaExpressao(expressao)) {
            System.out.println("Expressão correta!");
        } else {
            System.out.println("Expressão incorreta!");
        }
    }
}
