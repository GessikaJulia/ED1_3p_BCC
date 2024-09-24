import java.util.Scanner;

public class ex348_ED1_vs {
    public static void main(String[] args) {
        int L;
        String[] nomes = new String[5];
        double[] pr1 = new double[5];
        double[] pr2 = new double[5];
        double[] media = new double[5];
        Scanner scanner = new Scanner(System.in);

        for (L = 0; L <= 4; L++){
            System.out.println("Digite " + (L + 1) + " nome:");
            nomes[L] = scanner.nextLine();
            System.out.println("Digite a primeira nota:");
            pr1[L] = scanner.nextDouble();
            scanner.nextLine(); // consome a quebra de linha
            System.out.println("Digite a segunda nota:");
            pr2[L] = scanner.nextDouble();
            scanner.nextLine(); // consome a quebra de linha

            media[L] = (pr1[L] + pr2[L]) / 2;
        }
        
        System.out.println("\n\n\n\t\t\t\tRelaçao Final\n");
        for(L = 0; L <= 4; L++){
            System.out.println("\n" + (L+1) + " - " + nomes[L]);
            System.out.println("\n" + pr1[L] + "\t" + pr2[L] + "\t" + media[L]);
        }
    }
}
