import java.util.Stack;

class Converter {

    public static String infixaParaPrefixa(String expressao) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> operadores = new Stack<>();
        Stack<Character> temporario = new Stack<>();
        
        for (int i = expressao.length() - 1; i >= 0; i--) {
            char caractere = expressao.charAt(i);
            
            if (caractere == ' ') {
                continue;
            }
            
            if (Character.isLetterOrDigit(caractere)) {
                resultado.insert(0, caractere);
            } else if (caractere == ')') {
                operadores.push(caractere);
            } else if (caractere == '(') {
                while (!operadores.isEmpty() && operadores.peek() != ')') {
                    resultado.insert(0, operadores.pop());
                }
                operadores.pop(); 
            } else {
                while (!operadores.isEmpty() && precedencia(operadores.peek()) > precedencia(caractere)) {
                    resultado.insert(0, operadores.pop());
                }
                operadores.push(caractere);
            }
        }
        
        while (!operadores.isEmpty()) {
            resultado.insert(0, operadores.pop());
        }
        
        return resultado.toString();
    }
    
    public static String infixaParaPosfixa(String expressao) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> operadores = new Stack<>();
        
        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);
            
            if (caractere == ' ') {
                continue;
            }
            
            if (Character.isLetterOrDigit(caractere)) {
                resultado.append(caractere);
            } else if (caractere == '(') {
                operadores.push(caractere);
            } else if (caractere == ')') {
                while (!operadores.isEmpty() && operadores.peek() != '(') {
                    resultado.append(operadores.pop());
                }
                operadores.pop();
            } else {
                while (!operadores.isEmpty() && precedencia(operadores.peek()) >= precedencia(caractere)) {
                    resultado.append(operadores.pop());
                }
                operadores.push(caractere);
            }
        }
        
        while (!operadores.isEmpty()) {
            resultado.append(operadores.pop());
        }
        
        return resultado.toString();
    }
    
    public static String prefixaParaInfixa(String expressao) {
        Stack<String> pilha = new Stack<>();
        
        for (int i = expressao.length() - 1; i >= 0; i--) {
            char caractere = expressao.charAt(i);
            
            if (Character.isLetterOrDigit(caractere)) {
                pilha.push(Character.toString(caractere));
            } else {
                String operand1 = pilha.pop();
                String operand2 = pilha.pop();
                String novaExpressao = "(" + operand1 + caractere + operand2 + ")";
                pilha.push(novaExpressao);
            }
        }
        
        return pilha.pop();
    }
    
    public static String posfixaParaInfixa(String expressao) {
        Stack<String> pilha = new Stack<>();
        
        for (int i = 0; i < expressao.length(); i++) {
            char caractere = expressao.charAt(i);
            
            if (Character.isLetterOrDigit(caractere)) {
                pilha.push(Character.toString(caractere));
            } else {
                String operand2 = pilha.pop();
                String operand1 = pilha.pop();
                String novaExpressao = "(" + operand1 + caractere + operand2 + ")";
                pilha.push(novaExpressao);
            }
        }
        
        return pilha.pop();
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
}
