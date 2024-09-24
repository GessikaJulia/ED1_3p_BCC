import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", "123.456.789-00");
        Funcionario funcionario = new Funcionario("Maria", "987.654.321-00", "SIAPE123");
        Professor professor = new Professor("Carlos", "456.789.123-00", "SIAPE456", "Doutor");

        Queue<Pessoa> filaRefeitorio = new LinkedList<>();
        filaRefeitorio.add(pessoa);
        filaRefeitorio.add(funcionario);
        filaRefeitorio.add(professor);

        System.out.println("Fila completa: " + filaRefeitorio);
        
        Pessoa primeiroElemento = filaRefeitorio.peek();
        System.out.println("Primeiro elemento: " + primeiroElemento.getNome());

        filaRefeitorio.poll();
        System.out.println("Fila após a remoção: " + filaRefeitorio);

        Pessoa novaPessoa = new Pessoa("Ana", "789.123.456-00");
        filaRefeitorio.add(novaPessoa);
        System.out.println("Fila após adição: " + filaRefeitorio);

        Pessoa primeiroElementoSemRemover = filaRefeitorio.peek();
        System.out.println("Primeiro elemento sem remover: " + primeiroElementoSemRemover.getNome());

        System.out.println("Fila após peek: " + filaRefeitorio);

        System.out.println("Iteração sobre a fila:");
        for (Pessoa p : filaRefeitorio) {
            System.out.println(p.getNome());
        }
    }
}