//Задание №3
//        1) Написать метод, который принимает массив элементов, помещает их в стэк
//        и выводит на консоль содержимое стэка.
//        2) Написать метод, который принимает массив элементов, помещает их в
//        очередь и выводит на консоль содержимое очереди.

package seminar_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class task_3 {
    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,6,7,8,9,0};
        printAsQueue(array);
    }

    static void printAsStack(Integer[] array) {
        Stack<Integer> stack = new Stack<>();
//        stack.addAll(Arrays.asList(array));
        for (int i: array) {
            stack.push(i);
        }
        System.out.println(stack);
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
    static void printAsQueue(Integer[] array) {
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(array));
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
