package seminar01.DZ_Calc;

import java.util.ArrayDeque;
import java.util.Deque;

public class Calculator {
    private Deque<Double> stack;
    public Calculator() {
        stack = new ArrayDeque<>();

    }
    public double calculate(String operator, double operand1, double operand2) {
        double result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Некорректный оператор: '" + operator + "'");
                break;
        }
        stack.push(result);
        return result;
    }

    public double undo() {
        if (stack.size() < 2) {
            System.out.println("Недостаточно операций для отмены");
            return 0;
        }
        stack.pop();
        return stack.peek();
    }

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}