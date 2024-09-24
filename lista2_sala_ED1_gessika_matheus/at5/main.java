package questao_5;

public class main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeadaNumeros = new ListaEncadeada<>();
        listaEncadeadaNumeros.inicializarLista(1);
        listaEncadeadaNumeros.inserirElemento(2);
        listaEncadeadaNumeros.inserirElemento(3);

        System.out.println(listaEncadeadaNumeros);
        System.out.println(listaEncadeadaNumeros.vazia());
        System.out.println(listaEncadeadaNumeros.getTamanho());
        listaEncadeadaNumeros.removerElemento(2);
        System.out.println(listaEncadeadaNumeros);
    }
}
