public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome,  String cpf, String matricula, String curso) {
        super(nome , cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {

        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}
