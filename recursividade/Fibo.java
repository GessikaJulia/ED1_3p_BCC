public class Fibo {
    int termoFibo(int x) {
        return x <= 1 ? x : termoFibo(x - 1) + termoFibo(x - 2);
        //teste?

    }
}