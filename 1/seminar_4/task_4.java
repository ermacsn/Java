//Задание №4
//        Реализовать стэк с помощью массива.
//        Нужно реализовать методы:
//        size(), empty(), push(), peek(), pop().

package seminar_4;

public class task_4 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
