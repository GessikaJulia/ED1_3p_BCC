package questao_5;

public class ListaEncadeada<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private int tamanho;

    public void inicializarLista(T elemento){
        No<T> no = new No<>(elemento);
        this.primeiroNo = no;
        this.ultimoNo = no;
        this.tamanho++;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void removerElemento(T elemento){
        if (vazia()) {
            System.out.println("A lista está vazia.");
            return;
        }
        if (primeiroNo.getElemento().equals(elemento)) {
            primeiroNo = primeiroNo.getProximo();
            tamanho--;
            // Se a lista tinha apenas um elemento, atualize também o ultimoNo
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

        // Removendo o nó
        anterior.setProximo(atual.getProximo());
        tamanho--;

        // Se o elemento a ser removido está no último nó
        if (atual == ultimoNo) {
            ultimoNo = anterior;
        }
    }

    public boolean vazia(){
        if (this.tamanho == 0){
            return true;
        }
        return false;
    }

    public void inserirElemento(T elemento){
        No<T> no = new No<>(elemento);
        this.ultimoNo.setProximo(no);
        this.ultimoNo = no;
        this.tamanho++;

    }



    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "primeiroNo=" + primeiroNo +
                ", ultimoNo=" + ultimoNo +
                ", tamanho=" + tamanho +
                '}';
    }
}
