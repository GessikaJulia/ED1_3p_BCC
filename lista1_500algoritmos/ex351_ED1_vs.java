import java.util.Scanner;

public class ex351_ED1_vs {
    public static void main(String[] args) {
        int L;
        int num;
        String[] nomes = new String[5];
        Scanner scanner = new Scanner(System.in);
        
        for(L = 0; L<=4; L++){
            System.out.println("Nome"+(L+1)+ ":\n");
            nomes[L] = scanner.nextLine();
        }

        System.out.println("Digite o numero da pessoa:\n");
        num = scanner.nextInt();

        while (num <1 || num> 5) {
            System.out.println("Numero fora do intervalo\n");
            System.out.println("Digite o numero da pessoa:\n");
            num = scanner.nextInt();
            }
        
        System.out.println("\n" +nomes[num-1]);
        System.out.println("\n");

        

    }
}



             