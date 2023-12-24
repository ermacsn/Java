//Задание №0
//        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов.
//        Сравните с предыдущим.

package seminar_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class task_0 {
    public static void main(String[] args) {
        List<Integer> list_1 = new ArrayList<>();
        List<Integer> list_2 = new LinkedList<>();
        testTime(list_1);
        testTime(list_2);

        System.out.println(sumElem(list_1));
        System.out.println(sumElem(list_2));
    }

    static long sumElem(List<Integer> list) {
        long timeStart = System.currentTimeMillis();
        int sum = 0;
        for (Integer integer: list) {
            sum += integer;
        }
        System.out.println(sum);
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }

    static long testTime(List<Integer> list) {
        long timeStart = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        long timeFinish = System.currentTimeMillis();
        return timeFinish - timeStart;
    }
}
