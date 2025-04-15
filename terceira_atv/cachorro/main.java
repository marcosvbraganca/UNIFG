package cachorro;

public class main {

    public main(String[] args) {
        cachorro cachorro = new cachorro();
        System.out.println(cachorro.nome);
        System.out.println(cachorro.raca);
        System.out.println(cachorro.idade + " anos");
        cachorro.latir();
    }
}
