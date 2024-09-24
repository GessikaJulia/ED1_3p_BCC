public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return nome;
    }

    public String getNome() {
        return nome;
    }


    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimir(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}