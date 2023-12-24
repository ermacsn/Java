//Задание №2
//        Написать программу, определяющую правильность расстановки скобок в выражении.
//        Пример 1: a+(d*3) - истина
//        Пример 2: [a+(1*3) - ложь
//        Пример 3: [6+(3*3)] - истина
//        Пример 4: {a}[+]{(d*3)} - истина
//        Пример 5: <{a}+{(d*3)}> - истина
//        Пример 6: {a+]}{(d*3)} - ложь

package seminar_5;

import java.util.HashMap;
import  java.util.Stack;
public class task_2 {
    public static void main(String[] args) {
        System.out.println(isValid("1a+(d*3)"));
        System.out.println(isValid("[a+(1*3)"));
        System.out.println(isValid("[6+(3*3)]"));
        System.out.println(isValid("{a}[+]{(d*3)}"));
        System.out.println(isValid("<{a}+{(d*3)}>"));
        System.out.println(isValid("{a+]}{(d*3)}"));
    }

    public static boolean isValid (String str) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        map.put('<', '>');
        for (char ch: str.toCharArray()) {
            if (map.containsKey(ch)) {
                st.push(ch);
            }
            if (map.containsValue(ch)) {
                if (st.empty() || (map.get(st.pop()) != ch))
                    return false;
            }
        }
        return st.empty();
    }
}
