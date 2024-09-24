import java.util.Scanner;

public class ex360_ED1_vs {
    public static void main(String[] args) {
        int[] ultdia = new int[12];
        int data, i, dia, mes;
        String[] signo = new String[12];
        Scanner scanner = new Scanner(System.in);

        for(i=0; i<12; i++){
            System.out.println("Digite o signo:\n");
            signo[i] = scanner.nextLine();
            System.out.println("Digite o ultimo dia:\n");
            signo[i] = scanner.nextLine();
        }
        System.out.println("Digite data no formato ddmm ou 9999 para terminar:\n");
        data = scanner.nextInt();

        while (data != 9999) {
            dia = data/100;
            mes= data%100;
            mes--;
            if (dia>ultdia[mes]) {
                mes= (mes+1)%12;                
            }
            System.out.println("Signo: "+signo[ mes ]+ "\n");
            System.out.println("Digite data no formato ddmm ou 9999 para terminar: \n");
            data = scanner.nextInt();    
        }
        System.out.println("\n");
    }
}
