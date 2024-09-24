import java.util.Scanner;

public class ex356_ED1_vs {
    public static void main(String[] args) {
        int L, C, T;
        int[] media = new int[15];
        String[] nomes = new String[15];
        String[] sit = new String[15];
        double[] pr1 = new double[15];
        double[] pr2 = new double[15];
        Scanner scanner = new Scanner(System.in);

        for(L=0; L<=14; L++){
            System.out.println("Digite " + (L + 1) + " nome:\n");
            nomes[L] = scanner.nextLine();

            while (nomes[L].length() > 30){
                System.out.println("Nomes com até 30 caracteres:\n");
                System.out.println("Digite " + (L + 1) + " nome:\n");
                nomes[L] = scanner.nextLine();               
            }
            T = 30 - nomes[L].length();
            for(C = 1; C <= T; C++){
                nomes[L] = nomes[L] + " ";
            }
            System.out.println("Digite nota 1:\n");
            pr1[L] = scanner.nextDouble();
            scanner.nextLine(); // consome a quebra de linha
            System.out.println("Digite nota 2:\n");
            pr2[L] = scanner.nextDouble();
            scanner.nextLine(); // consome a quebra de linha

            media[L] = (int) Math.round((pr1[L] + pr2[L]) / 2 + 0.0001);

            if (media[L] == 5) {
                sit[L] = "APROVADO!";
            } else {
                sit[L] = "REPROVADO!";
            } 
        }
        System.out.println("\n\n\n\t\t\t\tRELAÇÃO FINAL\n");
        for(L = 0; L <= 14; L++){
            System.out.println("\n" + (L + 1) + " - " + nomes[L] + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L] + "\t" + sit[L]);
            System.out.println("\n");
        }
    }
}
