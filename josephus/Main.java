import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Nodo nodo = new Nodo();

        nodo.adicionarSoldado(new Soldado(1, "João Silva", "1234-5678", "Rua A, 123", "111.222.333-44"));
        nodo.adicionarSoldado(new Soldado(2, "Maria Oliveira", "2345-6789", "Rua B, 456", "222.333.444-55"));
        nodo.adicionarSoldado(new Soldado(3, "Carlos Santos", "3456-7890", "Rua C, 789", "333.444.555-66"));
        nodo.adicionarSoldado(new Soldado(4, "Ana Costa", "4567-8901", "Rua D, 101", "444.555.666-77"));
        nodo.adicionarSoldado(new Soldado(5, "Pedro Lima", "5678-9012", "Rua E, 202", "555.666.777-88"));
        nodo.adicionarSoldado(new Soldado(6, "Juliana Mendes", "6789-0123", "Rua F, 303", "666.777.888-99"));
        nodo.adicionarSoldado(new Soldado(7, "Ricardo Ferreira", "7890-1234", "Rua G, 404", "777.888.999-00"));
        nodo.adicionarSoldado(new Soldado(8, "Patrícia Almeida", "8901-2345", "Rua H, 505", "888.999.000-11"));
        nodo.adicionarSoldado(new Soldado(9, "Roberto Silva", "9012-3456", "Rua I, 606", "999.000.111-22"));
        nodo.adicionarSoldado(new Soldado(10, "Fernanda Rocha", "0123-4567", "Rua J, 707", "000.111.222-33"));
        nodo.adicionarSoldado(new Soldado(11, "Marcos Pereira", "1234-5678", "Rua K, 808", "111.222.333-44"));
        nodo.adicionarSoldado(new Soldado(12, "Cláudia Martins", "2345-6789", "Rua L, 909", "222.333.444-55"));
        nodo.adicionarSoldado(new Soldado(13, "Luiz Castro", "3456-7890", "Rua M, 100", "333.444.555-66"));
        nodo.adicionarSoldado(new Soldado(14, "Patrícia Souza", "4567-8901", "Rua N, 201", "444.555.666-77"));
        nodo.adicionarSoldado(new Soldado(15, "Daniela Lima", "5678-9012", "Rua O, 302", "555.666.777-88"));
        nodo.adicionarSoldado(new Soldado(16, "Eduardo Almeida", "6789-0123", "Rua P, 403", "666.777.888-99"));
        nodo.adicionarSoldado(new Soldado(17, "Camila Santos", "7890-1234", "Rua Q, 504", "777.888.999-00"));
        nodo.adicionarSoldado(new Soldado(18, "Thiago Costa", "8901-2345", "Rua R, 605", "888.999.000-11"));
        nodo.adicionarSoldado(new Soldado(19, "Sônia Ferreira", "9012-3456", "Rua S, 706", "999.000.111-22"));
        nodo.adicionarSoldado(new Soldado(20, "Gustavo Rocha", "0123-4567", "Rua T, 807", "000.111.222-33"));


        Random random = new Random();
        int m = random.nextInt(20) + 1;
        System.out.println("Valor de m: " + m);

        nodo.eliminarCadaMSoldado(m);
    }
}