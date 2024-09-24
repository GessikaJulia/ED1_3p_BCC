import java.util.Scanner;
import java.util.Stack;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selecione a notação desejada:");
        System.out.println("1. Infixa");
        System.out.println("2. Prefixa");
        System.out.println("3. Posfixa");
        int opcao = scanner.nextInt();
        
        System.out.println("Digite a expressão:");
        scanner.nextLine(); 
        String expressao = scanner.nextLine();
        
         switch (opcao) {
            case 1: 
                calcularEConverterInfixa(expressao);
                break;
            case 2: 
                calcularEConverterPrefixa(expressao);
                break;
            case 3: 
                calcularEConverterPosfixa(expressao);
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }
    }
    
    private static void calcularEConverterInfixa(String expressao) {
    
        double resultado = calcularExpressao(expressao);
        
        String prefixa = Converter.infixaParaPrefixa(expressao);
        
        String posfixa = Converter.infixaParaPosfixa(expressao);
        
        System.out.println("Resultado: " + resultado);
        System.out.println("Expressão em Prefixa: " + prefixa);
        System.out.println("Expressão em Posfixa: " + posfixa);
    }
    
    private static void calcularEConverterPrefixa(String expressao) {

        double resultado = calcularExpressao(Converter.prefixaParaInfixa(expressao));
        
        String infixa = Converter.prefixaParaInfixa(expressao);
        
        String posfixa = Converter.infixaParaPosfixa(infixa);
        
        System.out.println("Resultado: " + resultado);
        System.out.println("Expressão em Infixa: " + infixa);
        System.out.println("Expressão em Posfixa: " + posfixa);
    }
    
    private static void calcularEConverterPosfixa(String expressao) {
    
        double resultado = calcularExpressao(Converter.posfixaParaInfixa(expressao));
        
        String infixa = Converter.posfixaParaInfixa(expressao);
        
        String prefixa = Converter.infixaParaPrefixa(infixa);
        
        System.out.println("Resultado: " + resultado);
        System.out.println("Expressão em Infixa: " + infixa);
        System.out.println("Expressão em Prefixa: " + prefixa);
    }
    
    private static double calcularExpressao(String expressao) {
        Stack<Double> operandos = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);
            if (caractere == ' ') {
                continue;
            }


            if (Character.isDigit(caractere)) {
                StringBuilder sb = new StringBuilder();
                while (i < expressao.length() && (Character.isDigit(expressao.charAt(i)) || expressao.charAt(i) == '.')) {
                    sb.append(expressao.charAt(i++));
                }
                operandos.push(Double.parseDouble(sb.toString()));
                i--;
            } else if (caractere == '(') {
                operadores.push(caractere);
            } else if (caractere == ')') {
                while (operadores.peek() != '(') {
                    operandos.push(aplicarOperador(operadores.pop(), operandos.pop(), operandos.pop()));
                }
                operadores.pop();
            } else if (caractere == '+' || caractere == '-' || caractere == '*' || caractere == '/') {
                

                while (!operadores.empty() && precedencia(operadores.peek()) >= precedencia(caractere)) {
                    operandos.push(aplicarOperador(operadores.pop(), operandos.pop(), operandos.pop()));
                }
                operadores.push(caractere);
            }
        }

        while (!operadores.empty()) {
            operandos.push(aplicarOperador(operadores.pop(), operandos.pop(), operandos.pop()));
        }

        return operandos.pop();
    }

    private static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    private static double aplicarOperador(char operador, double b, double a) {
        switch (operador) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Divisão por zero!");
                }
                return a / b;
        }
        return 0;
    }
}

