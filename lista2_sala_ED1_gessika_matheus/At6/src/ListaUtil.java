import java.util.HashSet;
import java.util.Set;

public class ListaUtil {

    public static <T> ListaEncadeada<T> inverter(ListaEncadeada<T> lista) {
        ListaEncadeada<T> listaInvertida = new ListaEncadeada<>();
        No<T> atual = lista.getPrimeiroNo();
        while (atual != null) {
            No<T> no = new No<>(atual.getElemento());
            no.setProximo(listaInvertida.getPrimeiroNo());
            listaInvertida.setPrimeiroNo(no);
            if (listaInvertida.getUltimoNo() == null) {
                listaInvertida.setUltimoNo(no);
            }
            listaInvertida.incrementarTamanho();
            atual = atual.getProximo();
        }
        return listaInvertida;
    }

    public static <T extends Integer> ListaEncadeada<T> retornarImpares(ListaEncadeada<T> lista1, ListaEncadeada<T> lista2) {
        ListaEncadeada<T> listaImpares = new ListaEncadeada<>();
        adicionarImpares(listaImpares, lista1);
        adicionarImpares(listaImpares, lista2);
        return listaImpares;
    }

    private static <T extends Integer> void adicionarImpares(ListaEncadeada<T> destino, ListaEncadeada<T> origem) {
        No<T> atual = origem.getPrimeiroNo();
        while (atual != null) {
            if (atual.getElemento().intValue() % 2 != 0) {
                destino.inserirElemento(atual.getElemento());
            }
            atual = atual.getProximo();
        }
    }

    public static <T> ListaEncadeada<T> concatenar(ListaEncadeada<T> lista1, ListaEncadeada<T> lista2) {
        ListaEncadeada<T> listaConcatenada = new ListaEncadeada<>();
        adicionarElementos(listaConcatenada, lista1);
        adicionarElementos(listaConcatenada, lista2);
        return listaConcatenada;
    }

    private static <T> void adicionarElementos(ListaEncadeada<T> destino, ListaEncadeada<T> origem) {
        No<T> atual = origem.getPrimeiroNo();
        while (atual != null) {
            destino.inserirElemento(atual.getElemento());
            atual = atual.getProximo();
        }
    }

    public static <T> ListaEncadeada<T> intersecao(ListaEncadeada<T> lista1, ListaEncadeada<T> lista2) {
        ListaEncadeada<T> listaIntersecao = new ListaEncadeada<>();
        Set<T> elementos = new HashSet<>();
        No<T> atual = lista1.getPrimeiroNo();
        while (atual != null) {
            elementos.add(atual.getElemento());
            atual = atual.getProximo();
        }
        atual = lista2.getPrimeiroNo();
        while (atual != null) {
            if (elementos.contains(atual.getElemento())) {
                listaIntersecao.inserirElemento(atual.getElemento());
            }
            atual = atual.getProximo();
        }
        return listaIntersecao;
    }

    public static <T> ListaEncadeada<T> intercalar1(ListaEncadeada<T> lista1, ListaEncadeada<T> lista2) {
        ListaEncadeada<T> listaIntercalada = new ListaEncadeada<>();
        No<T> atual1 = lista1.getPrimeiroNo();
        No<T> atual2 = lista2.getPrimeiroNo();
        while (atual1 != null || atual2 != null) {
            if (atual1 != null) {
                listaIntercalada.inserirElemento(atual1.getElemento());
                atual1 = atual1.getProximo();
            }
            if (atual2 != null) {
                listaIntercalada.inserirElemento(atual2.getElemento());
                atual2 = atual2.getProximo();
            }
        }
        return listaIntercalada;
    }

    public static <T extends Comparable<T>> ListaEncadeada<T> intercalar2Ordenadamente(ListaEncadeada<T> lista1, ListaEncadeada<T> lista2) {
        ListaEncadeada<T> listaIntercalada = new ListaEncadeada<>();
        No<T> atual1 = lista1.getPrimeiroNo();
        No<T> atual2 = lista2.getPrimeiroNo();
        while (atual1 != null && atual2 != null) {
            if (atual1.getElemento().compareTo(atual2.getElemento()) <= 0) {
                listaIntercalada.inserirElemento(atual1.getElemento());
                atual1 = atual1.getProximo();
            } else {
                listaIntercalada.inserirElemento(atual2.getElemento());
                atual2 = atual2.getProximo();
            }
        }
        while (atual1 != null) {
            listaIntercalada.inserirElemento(atual1.getElemento());
            atual1 = atual1.getProximo();
        }
        while (atual2 != null) {
            listaIntercalada.inserirElemento(atual2.getElemento());
            atual2 = atual2.getProximo();
        }
        return listaIntercalada;
    }
}
