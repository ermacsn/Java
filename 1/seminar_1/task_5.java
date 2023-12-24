package seminar_1;
//Задание №5 (доп)
//Во фразе "Добро пожаловать на курс по Java" переставить слова
//в обратном порядке.

import java.lang.reflect.Array;
import java.util.Arrays;

public class task_5 {
    public static void main(String[] args) {
        String str = "Добро пожаловать на курс по Java";
        String[] array = str.split(" ");
        int size = array.length;
        for (int i = 0; i < size / 2; i++) {
            String temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
