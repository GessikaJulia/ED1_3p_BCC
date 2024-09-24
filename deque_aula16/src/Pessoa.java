public class Pessoa {
    int id;
    String sexo;
    int idade;
    boolean gestante;
    boolean lactante;
    boolean necessidadeEspecial;
    int prioridade;

    public Pessoa(int id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        this.prioridade = calculaPrioridade();
    }

    private int calculaPrioridade() {
        if (necessidadeEspecial) return 2;
        if (gestante || lactante) return 3;
        if (idade >= 60) return 1;
        return 0;
    }
}
