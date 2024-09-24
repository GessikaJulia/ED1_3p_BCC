public class DequeArray {
    private int capacidade;
    private int frente;
    private int fim;
    private char[] vetor;
    private int tamanhoAtual;

    public DequeArray(int capacidade) {
        this.capacidade = capacidade;
        this.frente = -1;
        this.fim = -1;
        this.vetor = new char[capacidade];
        this.tamanhoAtual = 0;
    }

    public boolean estaVazio() {
        return tamanhoAtual == 0;
    }

    public void inserirFrente(char valor) {
        if (tamanhoAtual == capacidade) {
            System.out.println("DEQUE CHEIO!!!");
            return;
        }
        if (estaVazio()) {
            frente = 0;
            fim = 0;
        } else if (frente == 0) {
            frente = capacidade - 1;
        } else {
            frente--;
        }
        vetor[frente] = valor;
        tamanhoAtual++;
    }

    public void inserirFim(char valor) {
        if (tamanhoAtual == capacidade) {
            System.out.println("DEQUE CHEIO!!!");
            return;
        }
        if (estaVazio()) {
            frente = 0;
            fim = 0;
        } else if (fim == capacidade - 1) {
            fim = 0;
        } else {
            fim++;
        }
        vetor[fim] = valor;
        tamanhoAtual++;
    }

    public char removerFrente() {
        if (estaVazio()) {
            System.out.println("DEQUE VAZIO");
            return '\0';
        }
        char temp = vetor[frente];
        if (frente == fim) {
            frente = -1;
            fim = -1;
        } else if (frente == capacidade - 1) {
            frente = 0;
        } else {
            frente++;
        }
        tamanhoAtual--;
        return temp;
    }

    public char removerFim() {
        if (estaVazio()) {
            System.out.println("DEQUE VAZIO!!!");
            return '\0';
        }
        char temp = vetor[fim];
        if (frente == fim) {
            frente = -1;
            fim = -1;
        } else if (fim == 0) {
            fim = capacidade - 1;
        } else {
            fim--;
        }
        tamanhoAtual--;
        return temp;
    }

    public void mostrarDeque() {
        if (estaVazio()) {
            System.out.println("DEQUE VAZIO!!!");
            return;
        }
        System.out.print("Elementos no DEQUE: ");
        int i = frente;
        while (true) {
            System.out.print(vetor[i] + " ");
            if (i == fim) {
                break;
            }
            i = (i + 1) % capacidade;
        }
        System.out.println();
    }
}
