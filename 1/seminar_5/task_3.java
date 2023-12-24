//Задание №5
//        Взять набор строк, например,
//
//        Мороз и солнце день чудесный
//        Еще ты дремлешь друг прелестный
//        Пора красавица проснись.
//
//        Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с
//        одинаковой длиной не должны “потеряться”

package seminar_5;

import java.util.*;

public class task_3 {
    public static void main(String[] args) {
//        String[] arr = new String[5];
//        arr[0]= "Мороз и солнце день чудесный";
//        arr[1] = "Еще ты дремлешь друг прелестный";
//        arr[2] = "Пора красавица проснись";
//        arr[3] = "Пора красавица проснись!";
//        arr[4] = "Пора красавица проснись";
//        System.out.println(sort(arr).toString());
        String str = "Мороз и солнце день чудесный\n" +
                     "Еще ты дремлешь друг прелестный\n" +
                     "Пора красавица проснись.";
        System.out.println(sort(str));
    }

//    static String sort (String[] str) {
//        TreeMap<Integer, String> map = new TreeMap<>();
//        for (String line: str) {
//            if (map.containsKey(line.length())) {
//                for (Integer key : map.navigableKeySet())
//                    line = line + " ";
//                }
//            map.put(line.length(), line);
//        }
//
//        String result = "";
//        for (Integer key: map.navigableKeySet()) {
////            result = result + map.get(key).strip() + '\n' ;
///        }
//        return result;
//    }

    static Map<Integer, List<String>> sort (String str) {
        str = str.replace(".", "").replace("\n", " ");
        String[] array = str.split(" ");
        TreeMap<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (String item: array) {
            int len = item.length();
            if (map.containsKey(len))
                map.get(len).add(item);
            else {
                List<String> word = new ArrayList<>();
                word.add(item);
                map.put(len, word);
            }
         }
       return map;
    }

}
