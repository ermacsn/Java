//Задание №3.
//Создать список типа ArrayList<String>.
//Поместить в него как строки, так и целые числа.
//Пройти по списку, найти и удалить целые числа

package seminar_3;

import java.util.ArrayList;
import java.util.Iterator;

public class task_3 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(34);
        list.add(77);
        list.add("r");
        list.add("ee");
        list.add(3.5);
        System.out.println(list);
        ArrayList list_2 = new ArrayList<>(list);
        ArrayList list_3 = new ArrayList<>(list);
        ArrayList list_4 = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

        for (int i = list_2.size() - 1; i >= 0; i--) {
            if (list_2.get(i) instanceof Integer) {
                list_2.remove(i);
            }
        }
        System.out.println(list_2);

        Iterator<Object> iterator = list_3.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof Integer) {
                iterator.remove();
            }
        }
        System.out.println(list_3);

        list_4.removeIf(x -> x instanceof Integer);
        System.out.println(list_4);
    }
}
