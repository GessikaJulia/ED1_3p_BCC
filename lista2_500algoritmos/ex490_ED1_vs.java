import java.util.Scanner;

public class ex490_ED1_vs {
    public static void main(String[] args) {
        String[] nome = new String[10];
        int l;
        Scanner scanner = new Scanner(System.in);

        for(l = 0; l < 10; l++){
            System.out.println("Digite palavra em letras minusculas" +(l+1)+":");
            nome[l] = scanner.nextLine();
            int count = restantes(nome[l], nome[l].length(), "c");
            System.out.println("\n" + (l + 1) + " - " + nome[l] + " - " + count + " substituições");
        }

        for ( l = 0; l < 10; l++) {
            System.out.println("\n" + (l + 1) + " - " + nome[l]);
        }
        scanner.close();
    }

    public static int restantes(String vet, int tam, String x){
        int cont = 0;

        for (int i = 0; i < tam; i++) {
            if (vet.charAt(i) == x.charAt(0)) {
                vet = vet.substring(0, i) + "*" + vet.substring(i + 1);
                cont++;     
            }
        }
        return cont;
    }
}
