public class atividade7 {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 6;
        int num3 = 14;

        if ((num1 > num2) && (num1 > num3)){
            System.out.println("O maior número é: " + num1);
        } else if ((num2 > num3) && (num2 > num1)){
            System.out.println("O maior número é: " +num2);
        } else{
            System.out.println("O maior número é: " + num3);
        }
    }
}
