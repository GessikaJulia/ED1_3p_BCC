public class Funcionario extends Pessoa{
    private String siape;

    public Funcionario(String nome, String cpf, String siape){
        super(nome, cpf);
        this.siape = siape;
    }

    @Override
    public String toString() {
        return super.toString() + " (Funcionario)";
    }

    public String getSiape(){
        return siape;
    }

    public void setSiape(String siape){
        this.siape = siape;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Siape: " + siape);
    }
}
