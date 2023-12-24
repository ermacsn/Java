//Задание №0
//        1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//        Распечатайте содержимое данного множества.
//        2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//        Распечатайте содержимое данного множества.
//        3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
//        Распечатайте содержимое данного множества.

package seminar_6;

import java.util.*;

public class task_0 {
    public static void main(String[] args) {
        Integer[] array = {4, 5, 1, 2, 2, 3, 6, 3, 100};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(array));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(array));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(array));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

    }
}
