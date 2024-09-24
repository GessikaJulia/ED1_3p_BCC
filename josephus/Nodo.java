public class Nodo {
    Soldado head;

    public void adicionarSoldado(Soldado novoSoldado) {
        if (head == null) {
            head = novoSoldado;
            head.proximo = head;
        } else {
            Soldado temp = head;
            while (temp.proximo != head) {
                temp = temp.proximo;
            }
            temp.proximo = novoSoldado;
            novoSoldado.proximo = head;
        }
    }

    public void eliminarCadaMSoldado(int m) {
        Soldado atual = head;
        Soldado anterior = null;

        while (atual.proximo != atual) {
            for (int i = 0; i < m - 1; i++) {
                anterior = atual;
                atual = atual.proximo;
            }
            System.out.println("Eliminando soldado número: " + atual.numero);
            anterior.proximo = atual.proximo;
            atual = anterior.proximo;
        }

        head = atual;
        System.out.println("O soldado sobrevivente é o número: " + head.numero);
    }
}
