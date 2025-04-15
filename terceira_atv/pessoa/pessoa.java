package pessoa;
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

    
}
