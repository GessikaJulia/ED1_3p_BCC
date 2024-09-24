public class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) { // Lista vazia: novo nó será o início e o fim
            inicio = fim = novoNo;
        } else { // Adiciona o novo nó ao final da lista
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void remover(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                if (atual.anterior != null) {
                    atual.anterior.proximo = atual.proximo;
                } else {
                    inicio = atual.proximo;
                }

                if (atual.proximo != null) {
                    atual.proximo.anterior = atual.anterior;
                } else {
                    fim = atual.anterior;
                }
                break;
            }
            atual = atual.proximo;
        }
    }

    public void esvaziar() {
        inicio = fim = null;
    }

    public int tamanho() {
        int tamanho = 0;
        No atual = inicio;
        while (atual != null) {
            tamanho++;
            atual = atual.proximo;
        }
        return tamanho;
    }

    public boolean contem(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
}