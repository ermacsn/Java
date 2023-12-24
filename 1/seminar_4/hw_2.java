package seminar_4;
import java.util.LinkedList;

class MyQueue<T> {
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T element){
        queue.add(element);
    }

    public T dequeue(){
       return queue.pollFirst();
    }

    public T first(){
        // Напишите свое решение ниже
        return queue.peekFirst();
    }

    public LinkedList<T> getElements() {
        return queue;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw_2 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}