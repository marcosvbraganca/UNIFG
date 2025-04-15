package carro;
public class carro {
    String marca,modelo;
    int ano;

    public carro(){
        marca="chevrolet";
        modelo="camaro";
        ano=2025;
    }

    public void exibirDetalhes(){
        carro carro=new carro();
        System.out.println("A marca do carro é: "+carro.marca);
        System.out.println("O modelo do carro é: "+carro.modelo);
        System.out.println("O ano do carro é: "+carro.ano);
    }

}
