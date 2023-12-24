//Задание №1
//        1. Напишите метод, который заполнит массив из 1000 элементов случайными
//        цифрами от 0 до 24.
//        2. Создайте метод, в который передайте заполненный выше массив и с
//        помощью Set вычислите процент уникальных значений в данном массиве и
//        верните его в виде числа с плавающей запятой.
//        Для вычисления процента используйте формулу:
//        процент уникальных чисел = количество уникальных чисел * 100 / общее
//        количество чисел в массиве.

package seminar_6;

import java.util.*;

public class task_1 {
    public static void main(String[] args) {
        Integer [] arrayInt = new Integer[1000];
        Random rand = new Random();
        for (int i = 0; i < 1000; i++) {
            arrayInt[i] = rand.nextInt(25);
        }
        System.out.println(Arrays.toString(arrayInt));

        System.out.println(uniqueValue(arrayInt));
    }

    static double uniqueValue(Integer[] array) {
        if (array.length == 0) return 0;
        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(array));
        System.out.println(set.size());
        System.out.println(array.length);
        return 100.0 * set.size() / array.length;
    }
}
