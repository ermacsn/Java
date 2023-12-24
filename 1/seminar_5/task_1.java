//Задание №1
//        Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными
//        и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
//        некоторую букву во втором слове, при этом
//        1. повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
//        порядка следования. (Например, add - egg изоморфны)
//        2. буква может не меняться, а остаться такой же. (Например, note - code)
//        Пример 1:
//        Input: s = "foo", t = "bar"
//        Output: false
//        Пример 2:
//        Input: s = "paper", t = "title"
//        Output: true
package seminar_5;

import java.util.HashMap;

public class task_1 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("add", "egg"));
        System.out.println(isIsomorphic("note", "code"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("bar", "foo"));
    }

    static boolean isIsomorphic(String str_1, String str_2) {
        HashMap<Character, Character> map = new HashMap<>();
        if (str_1.length() != str_1.length()) {
            return false;
        }
        for (int i = 0; i < str_1.length(); i++) {
            if (!map.containsKey(str_1.charAt(i))) {
                if (map.containsValue(str_2.charAt(i)))
                    return false;
                map.put(str_1.charAt(i), str_2.charAt(i));
            } else if (map.get(str_1.charAt(i)) != str_2.charAt(i))
                return false;
        }
        return true;
    }
}
