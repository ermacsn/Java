package seminar_4;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class Calculator {
    private Deque<Integer> queue = new ArrayDeque<>();
    public int calculate(char op, int a, int b) {

        int result = 0;
        switch (op) {
            case '+':
                result = a + b;
                queue.add(result);
                break;
            case '-':
                result = a - b;
                queue.add(result);
                break;
            case '*':
                result = a * b;
                queue.add(result);
                break;
            case '/':
                result = a / b;
                queue.add(result);
                break;
            case '<':
                if (!queue.isEmpty()) {
                    queue.removeLast();
                    result = queue.peekLast();
                }
        }
    return result;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw_3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 4;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        int result = calculator.calculate(op, a, b);
        System.out.println((double)result);
        int result2 = calculator.calculate(op2, c, d);
        System.out.println((double)result2);
        int prevResult = calculator.calculate(undo, 0, 0);
        System.out.println((double)prevResult);
    }
}