public class ProjetoClasse1 {
    
    public static void main(String[] args) {
        Pessoa teste = new Pessoa();

        teste.idade = 10;
        teste.nome = "Flixx";
        
        System.out.println("O nome da pessoa e..." +teste.nome);
        System.out.println("A idade da pessoa e..." +teste.idade);


        Pessoa cobaia = new Pessoa();

        cobaia.nome = "Rexx";
        cobaia.idade = 21;

        System.out.println("O noem da pessoa e..." +cobaia.nome);
        System.out.println("A idade da pessoa e..." +cobaia.idade);


        Aluno alunoBcc = new Aluno();

        alunoBcc.curso = "Ciencia da computacao";
        alunoBcc.materia = "ED1";

        System.out.println("O curso da pessoa e..." +alunoBcc.curso);
        System.out.println("A materia da pessoa e..." +alunoBcc.materia);


        
        Aluno alunoTsi= new Aluno();

        alunoTsi.curso = "Tecnologia em sistemas para a internet";
        alunoTsi.materia = "Ingles instrumental";

        System.out.println("O curso da pessoa e..." +alunoTsi.curso);
        System.out.println("A materia da pessoa e..." +alunoTsi.materia);


         
        Aluno alunoTi= new Aluno();

        alunoTi.curso = "Tecnico em informatica";
        alunoTi.materia = "Biologia";

        System.out.println("O curso da pessoa e..." +alunoTi.curso);
        System.out.println("A materia da pessoa e..." +alunoTi.materia);


    }
}
 