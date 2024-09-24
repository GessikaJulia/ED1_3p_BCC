public class AlgoMatematica {

    public static void main(String[] args) {
        Divisão op = new Divisão();  //op = operação

        op.dividendo = 10;
        op.divisor = 3;

        op.quociente = op.dividendo / op.divisor;
        op.resto = op.dividendo % op.divisor; //modulo %

        System.out.println("Dividendo..:" +op.dividendo);
        System.out.println("Divisor..:" +op.divisor);
        System.out.println("Quociente..:" +op.quociente);
        System.out.println("Resto..:" +op.resto);


    }
}