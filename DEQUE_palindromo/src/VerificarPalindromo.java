public class VerificarPalindromo {
    public static boolean ehPalindromo(String palavra) {
        DequeList deque = new DequeList();

        for (int i = 0; i < palavra.length(); i++) {
            deque.inserirFim(palavra.charAt(i));
        }

        while (!deque.estaVazio()) {
            if (deque.removerFrente() != deque.removerFim()) {
                return false;
            }
        }
        return true;
    }
}
