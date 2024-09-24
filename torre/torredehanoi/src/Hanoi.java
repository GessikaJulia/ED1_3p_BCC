public class Hanoi {
    long movimentos = 0;

    public long hanoi(int n, char origen, char auxiliar, char destino) {
        if (n > 0) {
            hanoi(n - 1, origen, destino, auxiliar);
            //System.out.println("Mover disco de " + origen + " para " + destino);
            movimentos++;
            hanoi(n - 1, auxiliar, origen, destino);
        }
        return movimentos;
    }

}
