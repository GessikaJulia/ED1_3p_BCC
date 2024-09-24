public class Main {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        System.out.println("1) Adicione Homer e Marge na lista e depois imprima o resultado:");
        lista.inserir(1);
        lista.inserir(2);
        lista.exibir();

        System.out.println("2) Esvazie a lista e imprima:");
        lista.esvaziar();
        lista.exibir();

        System.out.println("3) Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista:");
        lista.inserir(1);
        lista.inserir(3);
        lista.inserir(4);
        lista.exibir();

        System.out.println("4) Esvazie a lista:");
        lista.esvaziar();
        lista.exibir();

        System.out.println("5) Adicione Homer e Bart na lista e depois Adicione Lisa no início da lista. Imprima o resultado e o tamanho da lista:");
        lista.inserir(1);
        lista.inserir(3);
        lista.inserir(5);
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("6) Esvazie a lista e imprima:");
        lista.esvaziar();
        lista.exibir();

        System.out.println("7) Adicione Homer e Maggie na lista. Depois adicione Bart na posição 0 e Marge na posição 1 e imprima a lista. Verifique se Lisa está na lista:");
        lista.inserir(1);
        lista.inserir(6);
        lista.inserir(3);
        lista.inserir(2);
        lista.exibir();
        System.out.println("Lisa está na lista: " + lista.contem(5));

        System.out.println("8) Esvazie a lista:");
        lista.esvaziar();
        lista.exibir();

        System.out.println("9) Adicione Homer e Bart na lista e depois imprima o resultado e o tamanho da lista:");
        lista.inserir(1);
        lista.inserir(3);
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("10) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista:");
        System.out.println("Marge está na lista: " + lista.contem(2));
        System.out.println("Homer está na lista: " + lista.contem(1));
        System.out.println("Bart está na lista: " + lista.contem(3));
        System.out.println("Maggie está na lista: " + lista.contem(6));
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("11) Esvazie a lista:");
        lista.esvaziar();
        lista.exibir();

        System.out.println("12) Adicione Homer e Bart no começo da lista. Depois adicione Marge, e depois Maggie na posição 1 e depois Ned Flanders no Começo da lista e Sr. Burns no Final da lista e imprima a lista:");
        lista.inserir(1);
        lista.inserir(3);
        lista.inserir(2);
        lista.inserir(6);
        lista.inserir(7);
        lista.inserir(8);
        lista.exibir();

        System.out.println("13) Remova do fim da lista e imprima a lista:");
        lista.remover(8);
        lista.exibir();

        System.out.println("14) Remova a posição 1, depois imprima a lista e o tamanho da lista:");
        lista.remover(6);
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("15) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista:");
        System.out.println("Marge está na lista: " + lista.contem(2));
        System.out.println("Homer está na lista: " + lista.contem(1));
        System.out.println("Bart está na lista: " + lista.contem(3));
        System.out.println("Maggie está na lista: " + lista.contem(6));
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("16) Remova do começo da lista, depois imprima a lista e o tamanho da lista:");
        lista.remover(7);
        lista.exibir();
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("17) Verifique se Marge, Homer, Bart e Maggie estão na lista e depois imprima o resultado e o tamanho da lista:");
        System.out.println("Marge está na lista: " + lista.contem(2));
        System.out.println("Homer está na lista: " + lista.contem(1));
        System.out.println("Bart está na lista: " + lista.contem(3));
        System.out.println("Maggie está na lista: " + lista.contem(6));
        System.out.println("Tamanho: " + lista.tamanho());

        System.out.println("18) Esvazie a lista e imprima:");
        lista.esvaziar();
        lista.exibir();
    }
}
