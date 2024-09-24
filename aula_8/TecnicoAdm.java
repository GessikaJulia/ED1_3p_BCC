public class TecnicoAdm extends Funcionario{
    private String funcao;

    public TecnicoAdm(String nome, String cpf, String siape, String funcao){
        super(nome, cpf, siape);
        this.funcao = funcao;
    }

    public String getFuncao(){
        return funcao;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Função: " + funcao);
    }
}
