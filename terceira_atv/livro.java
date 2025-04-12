

public class livro {
    String titulo,autor;
    int numPaginas;

    public livro(){
        titulo="O mágico de oz";
        autor=" L. (Lyman) Frank Baum.";
        numPaginas=139;
    }

    public void exibirInformaçoes(){
        livro livro = new livro();
        System.out.println("O nome do livro é: "+livro.titulo);
        System.out.println("O autor do livro é: "+livro.autor);
        System.out.println("O livro tem: "+livro.numPaginas+" páginas");
    }

    public static void main(String[] args) {
        livro livro = new livro();
        livro.exibirInformaçoes();
    }

}



