//Задание №2
//        Реализовать консольное приложение, которое:
//        1. Принимает от пользователя и “запоминает” строки.
//        2. Если введено print, выводит строки так, чтобы последняя введенная
//        была первой в списке, а первая - последней.
//        3. Если введено revert, удаляет предыдущую введенную строку из памяти

package seminar_4;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        boolean exit = true;
        while (exit) {
            System.out.println("Введите строку: ");
            String answer = scanner.nextLine();
            switch (answer) {
                case "quit":
                    exit = false;
                    break;
                case "print":
                    ListIterator<String> iterator = stack.listIterator(stack.size());
                      while (iterator.hasPrevious()) {
                          System.out.println(iterator.previous());
                      }
//                    for (int i = stack.size() - 1; i >= 0 ; i--)
//                        System.out.println(stack.get(i));
                    break;
                case "revert":
                    stack.pop();
                    break;
                default:
                    stack.push(answer);
            }
            System.out.println(stack);
        }
    }
}
