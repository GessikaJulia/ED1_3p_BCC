public class Professor extends Funcionario {
    private String titulacao;

    public Professor(String nome, String cpf, String siape, String titulacao) {
        super(nome, cpf, siape);
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return super.toString() + " (Professor)";
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Titulação: " + titulacao);
    }
}
