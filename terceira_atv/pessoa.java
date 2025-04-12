public class pessoa {
    String nome;
    int idade,nova_idade;

    public pessoa(){
        nome="marcos";
        idade=18;
    }

    public void fazerAniversario(){
        nova_idade=idade+1;
        System.out.println("Parabéns,agora você tem "+nova_idade+" anos");
    }

    public static void main(String[] args) {
        pessoa pessoa= new pessoa();
        System.out.println("Você tem "+pessoa.idade+" anos");
        pessoa.fazerAniversario();
    }

}
