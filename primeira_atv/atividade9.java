public class atividade9 {
    public static void main(String[] args) {
        String texto = "Sucesso não é sobre a quantidade de horas que você trabalha, mas sobre como você usa essas horas";
        texto = texto.toLowerCase();

        String vogais = "aeiouáéíóúâêôãõ";

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);

            if (vogais.indexOf(letra) != -1){
                contador ++;
            }
        }

        System.out.println("Quantidade de vogais: " + contador);

    }
}
