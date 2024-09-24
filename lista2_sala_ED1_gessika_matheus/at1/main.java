package questao_1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        int numeroBuscado = 1;
        int numero = 762021192;

        System.out.println(contaKNumerosPresentes(numero, numeroBuscado));

    }

    public static int contaKNumerosPresentes(int numero, int numeroBuscado){
        if (numero == 0){
            return 0;

        }

        int ultimoDigito = numero % 10;
        int quociente = numero / 10;

        if (ultimoDigito == numeroBuscado){
            return 1 + contaKNumerosPresentes(quociente, numeroBuscado);
        } else {
            return contaKNumerosPresentes(quociente, numeroBuscado);
        }

    }

}
