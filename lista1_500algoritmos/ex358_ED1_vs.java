import java.util.Scanner;

public class ex358_vs {
    public static void main(String[] args) {
        double[] precocompra = new double[100];
        double[] precovenda = new double[100];
        double lucro;
        int totlucromenor10, totlucromenor20, totlucromaior20, A; 
        Scanner scanner = new Scanner(System.in);

        totlucromenor10=0;
        totlucromenor20=0;
        totlucromaior20=0;

        for(A=0; A<100; A++){
            System.out.println("Preço da compra:\n");
            precocompra[A] = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Preço da venda:\n");
            precovenda[A] = scanner.nextDouble();
            scanner.nextLine();
        }
        for(A=0; A<100; A++){
            lucro = precovenda[A] - precocompra[A];
            if (lucro < 10.0) {
                totlucromenor10++; 
            } else{
                if (lucro<=20.00) {
                    totlucromenor20++;
                } else{
                    totlucromaior20++;
                }
            }
            System.out.println("Total de mercadorias com lucro < 10%:\n"+totlucromenor10);
            System.out.println("Total de mercadorias com <= 20%:\n"+totlucromenor20);
            System.out.println("Total de mercadorias com lucro > 20%:\n"+totlucromaior20);

            System.out.println("\n");
            

        }
        

        

        
       
        

    }
}
