import java.util.Scanner;

public class Main {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo numero: ");
        int num2 = scanner.nextInt();

        Calculadora calculadora= new Calculadora();
        int soma = calculadora.somar(num1,num2);

        System.out.println("A soma é: " + soma);
        scanner.close();
    }
}