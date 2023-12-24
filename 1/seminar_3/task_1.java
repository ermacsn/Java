//Задание №1.
//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран.
package seminar_3;

import java.util.*;
import java.util.Random;


public class task_1 {
    public static void main(String[] args) {
        int num = 10;
        int max = 10;
        List<Integer> list = createList(num, max);
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }

    static List<Integer> createList(int num, int max) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(random.nextInt(max));
        }
        return list;
    }

}
