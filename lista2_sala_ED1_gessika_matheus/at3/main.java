package questao_3;

public class main {
    public static void main(String[] args) {
        System.out.println(MOD(13,3));
        System.out.println(MOD(2,5));
        System.out.println(MOD(3,3));
    }

    public static int MOD(int x, int y){
        if (x == y){
            return 0;
        } else if (x < y) {
            return x;
        } else if (x > y) {
            return MOD(x-y, y);
        }
        return 0;
    }

}
