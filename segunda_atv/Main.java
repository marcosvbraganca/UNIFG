package segunda_atv;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(num1,num2);

        System.out.println("A soma é: " + soma);
        scanner.close();
    }
    
}
