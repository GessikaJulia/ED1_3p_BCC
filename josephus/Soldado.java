public class Soldado {
    int numero;
    String nome;
    String telefone;
    String endereco;
    String cpf;
    Soldado proximo;

    public Soldado(int numero, String nome, String telefone, String endereco, String cpf) {
        this.numero = numero;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }
}