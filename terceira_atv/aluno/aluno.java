package aluno;
public class aluno {
    String nome,matricula;

    public aluno(){
        nome="marcos";
        matricula="135223749";
    }

    public void exibirInformações(){
        aluno aluno = new aluno();
        System.out.println("O nome do aluno é: "+aluno.nome);
        System.out.println("A matrícula do aluno é: "+aluno.matricula);
    }

}
