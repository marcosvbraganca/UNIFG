package produto;

public class main {
    public main(String[] args) {
        produto produto = new produto();
        System.out.println(produto.preco);
        produto.aplicarDesconto(5);
    }
}
