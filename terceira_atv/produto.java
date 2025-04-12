public class produto {
    String nome;
    double preco,novo_preco;
    
    public produto(){
        nome="bombril";
        preco=10;
        
    }

    public void aplicarDesconto(double percentual){
        novo_preco=preco-percentual;
        System.out.println("O preço após o desconto é"+novo_preco);
    }

    public static void main(String[] args) {
        produto produto = new produto();
        System.out.println(produto.preco);
        produto.aplicarDesconto(5);
    }

}
