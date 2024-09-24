import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade de discos: ");
        int discos = scanner.nextInt();

        Hanoi hanoi = new Hanoi();

        long inicioTempo = System.currentTimeMillis();

        hanoi.hanoi(discos, 'a', 'b', 'c');

        long fimTempo = System.currentTimeMillis();
        long totalTempo = fimTempo - inicioTempo;

        long horas = (totalTempo / (1000 * 60 * 60)) % 24;
        long minutos = (totalTempo / (1000 * 60)) % 60;
        long segundos = (totalTempo / 1000) % 60;
        long milisegundos = totalTempo % 1000;

        System.out.printf("Tempo gasto: %02d:%02d:%02d:%03d\n", horas, minutos, segundos, milisegundos);
        System.out.println("Quantidade de movimentos: " + hanoi.movimentos);
    }
}
