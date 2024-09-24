public class At2{
    public static void main(String[] args) {
        System.out.println(mdc(81, 27));

        System.out.println(mdc(20, 25));

        System.out.println(mdc(17, 31));
    }

    public static int mdc(int x, int y) {

        if (x == y) {
            return x;
        }

        else if (x > y) {
            return mdc(x - y, y);
        }
               else {
            return mdc(y - x, x);
        }
    }
}
