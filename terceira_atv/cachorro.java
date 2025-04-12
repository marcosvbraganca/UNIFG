
public class cachorro {
    public String nome,raca;
    public int idade;

    public cachorro(){
        nome="simba";
        raca="lulu pomerania";
        idade=5;
    }

    public void latir(){
        System.out.println("Au Au");
    }

    public static void main(String[] args) {
        cachorro cachorro = new cachorro();
        System.out.println(cachorro.nome);
        System.out.println(cachorro.raca);
        System.out.println(cachorro.idade + " anos");
        cachorro.latir();
    }
}
