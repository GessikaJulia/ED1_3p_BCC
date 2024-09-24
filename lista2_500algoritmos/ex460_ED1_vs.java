import java.util.Scanner;

public class ex460_ED1_vs {

    public static void main(String[] args) {
        int a, c; 
        Scanner scanner = new Scanner(System.in);
         
        for(c=-1; c<=3 ; c++){
            System.out.println("digite numero: \n");
            a = scanner.nextInt();
            System.out.println("dobro:" +dob(a));
        }
        
    }
    
    public static int dob(int x) {
    return x * 2;
}
}

