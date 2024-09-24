import java.util.Scanner;

public class ex470_ED1_vs {
    public static void main(String[] args) {
        int num, pri;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero maior que 0:");
        num = scanner.nextInt();
        scanner.close();

        pri = primo(num);

        if (pri == 0) {
            System.out.println("O valor" +num+ "é primo!");
        } else {
            System.out.println("O valor" +num+ " NÃO é primo!");
        }

    }
    public static int primo (int n){
        int c, p;
        c=0;
        p=2;

        while (c == 0 && p <= n/2) {
            if (n%p == 0 ) {
                c=1;
            }
            p++;
        }
        return c;
    }
}
