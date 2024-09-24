import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        int x;
        int tam;
        String frase;

        do {
            System.out.println("Menu:\n");
            System.out.println("1 - Imprime o comprimento da frase\n");
            System.out.println("2 - Imprime os dois primeiros e os dois ultimos caracteres da frase \n");
            System.out.println("3 - Imprime a frase espelhada\n");
            System.out.println("4 - Termina o programa\n");
            System.out.println("Insira a opção desejada:\n");
            op = scanner.nextInt();
            scanner.nextLine(); // consome a quebra de linha

            switch (op) {
                case 1:
                    System.out.println("Digite uma frase:\n");
                    frase = scanner.nextLine();
                    System.out.println("Numero de caracteres da frase:\n" + frase.length());
                    break;

                case 2:
                    System.out.println("Digite uma frase:\n");
                    frase = scanner.nextLine();
                    System.out.println("Os dois primeiros caracteres:\n" + frase.substring(0, 2));
                    tam = frase.length() - 2;
                    System.out.println("Os dois ultimos caracteres:" + frase.substring(tam));
                    break;

                case 3:
                    System.out.println("Digite uma frase:\n");
                    frase = scanner.nextLine();
                    for (x = frase.length() - 1; x >= 0; x--) {
                        System.out.println(frase.charAt(x));
                    }
                    break;

                case 4:
                    System.out.println("Fim do programa");
                    break;

                default:
                    System.out.println("Opção indisponivel");
                    break;
            }
            System.out.println("\n\n");
        } while (op != 4);
        System.err.println("\n\n");
    }
}
