import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Deque fila = new Deque(100);
        Random random = new Random();


        for (int i = 0; i < 100; i++) {
            int id = i + 1;
            String sexo = random.nextBoolean() ? "M" : "F";
            int idade = random.nextInt(100);
            boolean gestante = sexo.equals("F") && random.nextBoolean();
            boolean lactante = sexo.equals("F") && !gestante && random.nextBoolean();
            boolean necessidadeEspecial = random.nextBoolean();

            Pessoa pessoa = new Pessoa(id, sexo, idade, gestante, lactante, necessidadeEspecial);
            fila.inserirFim(pessoa);
        }


        for (int i = 0; i < 100; i++) {
            Pessoa atendido = fila.removerFrente();
            if (atendido != null) {
                System.out.println("Pessoa atendida: ID " + atendido.id + " | Prioridade: " + atendido.prioridade);
            }
        }

        fila.mostrarDeque();
    }
}
