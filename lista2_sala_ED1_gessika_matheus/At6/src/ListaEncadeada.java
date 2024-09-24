public class ListaEncadeada<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho;

    public void inicializarLista(T elemento) {
        No<T> no = new No<>(elemento);
        this.primeiroNo = no;
        this.ultimoNo = no;
        this.tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void removerElemento(T elemento) {
        if (vazia()) {
            System.out.println("A lista está vazia.");
            return;
        }
        if (primeiroNo.getElemento().equals(elemento)) {
            primeiroNo = primeiroNo.getProximo();
            tamanho--;
            if (primeiroNo == null) {
                ultimoNo = null;
            }
            return;
        }

        No<T> atual = primeiroNo;
        No<T> anterior = null;

        while (atual != null && !atual.getElemento().equals(elemento)) {
            anterior = atual;
            atual = atual.getProximo();
        }
        if (atual == null) {
            System.out.println("Elemento não encontrado na lista.");
            return;
        }

        anterior.setProximo(atual.getProximo());
        tamanho--;

        if (atual == ultimoNo) {
            ultimoNo = anterior;
        }
    }

    public boolean vazia() {
        return this.tamanho == 0;
    }

    public void inserirElemento(T elemento) {
        No<T> no = new No<>(elemento);
        if (this.vazia()) {
            this.primeiroNo = no;
            this.ultimoNo = no;
        } else {
            this.ultimoNo.setProximo(no);
            this.ultimoNo = no;
        }
        this.tamanho++;
    }

    public No<T> getPrimeiroNo() {
        return primeiroNo;
    }

    public void setPrimeiroNo(No<T> primeiroNo) {
        this.primeiroNo = primeiroNo;
    }

    public No<T> getUltimoNo() {
        return ultimoNo;
    }

    public void setUltimoNo(No<T> ultimoNo) {
        this.ultimoNo = ultimoNo;
    }

    public void incrementarTamanho() {
        this.tamanho++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        No<T> atual = primeiroNo;
        while (atual != null) {
            sb.append(atual.getElemento()).append(" -> ");
            atual = atual.getProximo();
        }
        sb.append("null");
        return sb.toString();
    }
}