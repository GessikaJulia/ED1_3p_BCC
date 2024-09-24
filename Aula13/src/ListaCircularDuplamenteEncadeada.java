public class ListaCircularDuplamenteEncadeada {
    private No sentinela;

    public ListaCircularDuplamenteEncadeada() {
        sentinela = new No(0);
        sentinela.anterior = sentinela;
        sentinela.proximo = sentinela;
    }

    public void inserirOrdenado(int valor) {
        No novoNo = new No(valor);
        No atual = sentinela.proximo;

        while (atual != sentinela && atual.valor < valor) {
            atual = atual.proximo;
        }

        novoNo.proximo = atual;
        novoNo.anterior = atual.anterior;
        atual.anterior.proximo = novoNo;
        atual.anterior = novoNo;
    }

    public void imprimirCrescente() {
        No atual = sentinela.proximo;
        while (atual != sentinela) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirDecrescente() {
        No atual = sentinela.anterior;
        while (atual != sentinela) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    public void removerPrimos() {
        No atual = sentinela.proximo;
        while (atual != sentinela) {
            if (ehPrimo(atual.valor)) {
                atual.anterior.proximo = atual.proximo;
                atual.proximo.anterior = atual.anterior;
            }
            atual = atual.proximo;
        }
    }

    private boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
