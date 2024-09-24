import java.util.Random;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> pilhaN = new Stack<>();
        Stack<Integer> pilhaP = new Stack<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            int numero = random.nextInt(201) - 100;
            if (numero > 0) {
                pilhaP.push(numero);
            } else if (numero < 0) {
                pilhaN.push(numero);
            } else {
                if (!pilhaN.isEmpty()) {
                    System.out.println("Pilha N: " + pilhaN.pop());
                }
                if (!pilhaP.isEmpty()) {
                    System.out.println("Pilha P: " + pilhaP.pop());
                }
            }
        }
        System.out.println("Pilha N: " + pilhaN);
        System.out.println("Pilha P: " + pilhaP);
    }
}