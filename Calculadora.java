import java.util.Scanner;

public class Calculadora {
    public static double adicao(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return Double.NaN; 
        } else {
            return num1 / num2;
        }
    }

    public static double potencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static double raizQuadrada(double num) {
        if (num < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return Double.NaN; 
        } else {
            return Math.sqrt(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 'S';

        while (continuar != 'q') {
            System.out.println("Escolha a operação:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Potência");
            System.out.println("6 - Raiz Quadrada");
            System.out.println("q - Sair");

            char escolha = scanner.next().charAt(0);
            if (escolha == 'q') {
                continuar = 'q';
                break;
            }

            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();

            double resultado;
            if (escolha != '6') {
                System.out.println("Digite o segundo número:");
                double num2 = scanner.nextDouble();

                switch (escolha) {
                    case '1':
                        resultado = adicao(num1, num2);
                        break;
                    case '2':
                        resultado = subtracao(num1, num2);
                        break;
                    case '3':
                        resultado = multiplicacao(num1, num2);
                        break;
                    case '4':
                        resultado = divisao(num1, num2);
                        break;
                    case '5':
                        resultado = potencia(num1, num2);
                        break;
                    default:
                        System.out.println("Operação inválida.");
                        resultado = Double.NaN;
                        break;
                }
            } else {
                resultado = raizQuadrada(num1);
            }

            if (!Double.isNaN(resultado)) {
                System.out.println("Resultado: " + resultado);
            }
        }

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}