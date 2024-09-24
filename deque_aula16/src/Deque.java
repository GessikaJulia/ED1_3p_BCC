public class Deque {
    int capacidade;
    int frente;
    int fim;
    Pessoa[] vetor;
    int tamanhoAtual;

    public Deque(int capacidade) {
        this.capacidade = capacidade;
        this.vetor = new Pessoa[capacidade];
        this.frente = -1;
        this.fim = -1;
        this.tamanhoAtual = 0;
    }

    public void inserirFim(Pessoa pessoa) {
        if (tamanhoAtual == capacidade) {
            System.out.println("Cheio");
            return;
        }
        if (fim == -1) {
            frente = 0;
            fim = 0;
        } else if (fim == capacidade - 1) {
            fim = 0;
        } else {
            fim = fim + 1;
        }
        vetor[fim] = pessoa;
        tamanhoAtual++;
    }

    public Pessoa removerFrente() {
        if (tamanhoAtual == 0) {
            System.out.println("Acabou");
            return null;
        }
        Pessoa temp = vetor[frente];
        if (frente == fim) {
            frente = -1;
            fim = -1;
        } else if (frente == capacidade - 1) {
            frente = 0;
        } else {
            frente = frente + 1;
        }
        tamanhoAtual--;
        return temp;
    }

    public void mostrarDeque() {
        if (tamanhoAtual == 0) {
            System.out.println("Acabou");
            return;
        }
        System.out.print("Elementos: ");
        int i = frente;
        while (true) {
            System.out.print(vetor[i].id + " ");
            if (i == fim) {
                break;
            }
            i = (i + 1) % capacidade;
        }
        System.out.println();
    }
}
