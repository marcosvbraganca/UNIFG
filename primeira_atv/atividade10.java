public class atividade10 {
    public static void main(String[] args) {

        int  numero = 8;

        int armazenando = 3;

        for (int i = numero; i > 0; i--) {
            armazenando = i*armazenando;
        }
        System.out.println("O valor do fatorial foi: " + armazenando);
    }

}
