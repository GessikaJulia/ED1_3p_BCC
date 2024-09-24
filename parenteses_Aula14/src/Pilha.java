public class Pilha {
    private Nodo topo;

    public Pilha() {
        this.topo = null;
    }

    public void empilhar(char valor) {
        Nodo novoNodo = new Nodo(valor);
        if (this.topo != null) {
            novoNodo.anterior = this.topo;
            this.topo.proximo = novoNodo;
        }
        this.topo = novoNodo;
    }

    public char desempilhar() {
        if (this.topo == null) {
            System.out.println("A pilha está vazia!");
            return '\0';
        }
        char valor = this.topo.valor;
        this.topo = this.topo.anterior;
        if (this.topo != null) {
            this.topo.proximo = null;
        }
        return valor;
    }

    public char consultarTopo() {
        if (this.topo == null) {
            System.out.println("A pilha está vazia!");
            return '\0';
        }
        return this.topo.valor;
    }

    public boolean estaVazia() {
        return this.topo == null;
    }

    public boolean verificaExpressao(String expressao) {
        Pilha pilha = new Pilha();

        for (char c : expressao.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pilha.empilhar(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pilha.estaVazia()) {
                    return false;
                }
                char topo = pilha.desempilhar();
                if ((c == ')' && topo != '(') ||
                        (c == ']' && topo != '[') ||
                        (c == '}' && topo != '{')) {
                    return false;
                }
            }
        }
        return pilha.estaVazia();
    }
}
