class Pilha {
    private Nodo topo;

    public Pilha() {
        this.topo = null;
    }

    public void empilhar(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (this.topo != null) {
            novoNodo.anterior = this.topo;
            this.topo.proximo = novoNodo;
        }
        this.topo = novoNodo;
    }

    public Integer desempilhar() {
        if (this.topo == null) {
            return null; // Pilha vazia
        }
        int valor = this.topo.valor;
        this.topo = this.topo.anterior;
        if (this.topo != null) {
            this.topo.proximo = null;
        }
        return valor;
    }

    public boolean estaVazia() {
        return this.topo == null;
    }

    public void mostrarElementos() {
        Nodo atual = this.topo;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    public int contarElementos() {
        int contador = 0;
        Nodo atual = this.topo;
        while (atual != null) {
            contador++;
            atual = atual.anterior;
        }
        return contador;
    }
}
