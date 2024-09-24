import java.util.Scanner;

public class ex500_ED1_vs {
    public static void main(String[] args) {
        int[] num = new int[5];
        int[] numl = new int[5];
        int flag = 0;
        int flagl = 0;
        int op, l;
        Scanner scanner = new Scanner(System.in);

        for(l = 0; l < 5; l++){
            num[l] = 0;
            numl[l] = 0;
        }

        do {
            System.out.println("\n\n\n");
            System.out.println("\nVETORES\n");
            System.out.println("\n1 Dados do VETOR A");
            System.out.println("\n2 Dados do VETOR B");
            System.out.println("\n3 Imprime VETORES");
            System.out.println("\n4 Soma VETORES");
            System.out.println("\n5 Subtrai VETORES");
            System.out.println("\n6 Sai do programa");
            System.out.println("\nOPCAO:");
            op = scanner.nextInt();

            switch(op) {
                case 1:
                    entrada(num, 5, "A");
                    flag = 1;
                    break;
                case 2:
                    entrada(numl, 5, "B");
                    flagl = 1;
                    break;
                case 3:
                    if(flag != 0 && flagl != 0) {
                        imprime(num, 5, "A");
                        imprime(numl, 5, "B");
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 4:
                    if(flag != 0 && flagl != 0) {
                        soma(num, numl, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 5:
                    if(flag != 0 && flagl != 0) {
                        subtrai(num, numl, 5);
                    } else {
                        System.out.println("\nEscolha primeiro opcoes 1 e 2");
                    }
                    break;
                case 6:
                    System.out.println("\nSaindo do Algoritmo");
                    break;
                default:
                    System.out.println("\nOpcao invalida");
            }
        } while( op != 6);

        System.out.println("\n");
    }

    public static void entrada(int[] vet, int t, String c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEntrada do VETOR");
        for(int l = 0; l < t; l++) {
            System.out.println("Digite numero " + (l + 1) + ": ");
            vet[l] = scanner.nextInt();
        }
    }

    public static void imprime(int[] vet, int t, String c) {
        System.out.println("\nVETOR " + c + "\n");
        for(int l = 0; l < t; l++) {
            System.out.println("\n" + (l + 1) + " " + vet[l]);
        }
    }

    public static void soma(int[] vet, int[] vetl, int t) {
        System.out.println("\nSOMA\n");
        for(int l = 0; l < t; l++) {
            int s = vet[l] + vetl[l];
            System.out.println("\n" + s);
        }
    }

    public static void subtrai(int[] vet, int[] vetl, int t) {
        System.out.println("\nDIFERENCA\n");
        for(int l = 0; l < t; l++) {
            int d = vet[l] - vetl[l];
            System.out.println("\n" + d);
        }
    }
}
