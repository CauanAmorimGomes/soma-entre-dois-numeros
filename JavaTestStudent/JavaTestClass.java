import java.util.Scanner;

public class JavaTestClass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { // try-with-resources fecha o Scanner automaticamente
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();

            int soma = num1 + num2;
            System.out.println("A soma dos números é: " + soma);
        } // O Scanner será fechado automaticamente aqui
    }
}
