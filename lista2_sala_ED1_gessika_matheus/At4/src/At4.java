public class At4 {
    public static void main(String[] args) {

        System.out.println(decimalPraBinario(1));

        System.out.println(decimalPraBinario(2));

        System.out.println(decimalPraBinario(3));

        System.out.println(decimalPraBinario(4));

        System.out.println(decimalPraBinario(5));

        System.out.println(decimalPraBinario(10));
    }

    public static String decimalPraBinario(int n) {
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            return decimalPraBinario(n / 2) + (n % 2);
        }
    }
}
