import java.util.Scanner;

public class ex480_ED1_vs {
    public static void main(String[] args) {
        int n,x;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:\n");
        n = scanner.nextInt();
        scanner.close();

        x = reverso(n);

        System.out.println("\n"+n+"-"+x);
        if (x == n) {
            System.out.println("É um numero capicua!\n");            
        } else {
            System.out.println("NÃO é um numero capicua!\n");
        }
    }
    public static int reverso(int num){
        int soma = 0;
        int r;
        
        while(num != 0){
            r = num % 10;
            soma = soma * 10 + r;
            num = num / 10;
        }
        return soma;
    }
}
