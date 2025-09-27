import java.util.Scanner;
import java.util.Locale;

public class CalculaJava {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("[--------] BEM-VINDO(A) À CALCULADORA JAVA [--------]");

        while (true) {
            System.out.print("\nQual operação (+, -, *, /)? ['Q' para sair] ");
            String operacao = input.next();

            if (operacao.equalsIgnoreCase("Q")) {
                System.out.println("Encerrando calculadora...");
                break;
            } else if (operacao.equals("+") || operacao.equals("-") || operacao.equals("*") || operacao.equals("/")) {

                System.out.print("Digite o primeiro número: ");
                double num1 = input.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = input.nextDouble();

                double resultado = 0;

                switch (operacao) {
                    case "+" -> resultado = num1 + num2;
                    case "-" -> resultado = num1 - num2;
                    case "*" -> resultado = num1 * num2;
                    case "/" -> {
                        if (num2 == 0) {
                            System.out.println("ERRO: Divisão por zero não é permitida!");
                            continue;
                        }
                        resultado = num1 / num2;
                    }
                }

                System.out.println("[----------] Resultado: " + resultado);

            } else {
                System.out.println("Operação inválida!");
            }
        }

        input.close();
    }
}
