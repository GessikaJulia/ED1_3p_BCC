import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaL1 = new ListaEncadeada<>();
        ListaEncadeada<Integer> listaL2 = new ListaEncadeada<>();

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            listaL1.inserirElemento(random.nextInt(201) - 100);
            listaL2.inserirElemento(random.nextInt(201) - 100);
        }

        System.out.println("Lista L1: " + listaL1);
        System.out.println("Lista L2: " + listaL2);

        ListaEncadeada<Integer> listaInvertidaL1 = ListaUtil.inverter(listaL1);
        System.out.println("Lista L1 Invertida: " + listaInvertidaL1);

        ListaEncadeada<Integer> listaImpares = ListaUtil.retornarImpares(listaL1, listaL2);
        System.out.println("Lista com elementos ímpares de L1 e L2: " + listaImpares);

        ListaEncadeada<Integer> listaConcatenada = ListaUtil.concatenar(listaL1, listaL2);
        System.out.println("Lista L1 e L2 concatenadas: " + listaConcatenada);

        ListaEncadeada<Integer> listaIntersecao = ListaUtil.intersecao(listaL1, listaL2);
        System.out.println("Intersecção de L1 e L2: " + listaIntersecao);

        ListaEncadeada<Integer> listaIntercalada1 = ListaUtil.intercalar1(listaL1, listaL2);
        System.out.println("Intercalando L1 e L2 na ordem original: " + listaIntercalada1);

        ListaEncadeada<Integer> listaIntercalada2 = ListaUtil.intercalar2Ordenadamente(listaL1, listaL2);
        System.out.println("Intercalando L1 e L2 em ordem crescente: " + listaIntercalada2);
    }
}
