//Задание №2
//Напишите метод, который сжимает строку.
//Пример: вход aaaabbbcdd.
package seminar_2;

import java.util.HashSet;

public class task_2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        System.out.println(zip_str(str));
    }

    static String zip_str(String str) {
        String result = "";
        String ch = "";
        for (int i = 0; i < str.length(); i++) {
            ch = Character.toString(str.charAt(i));
            if (result.contains(ch) == false ) result= result + ch;
        }
       return result;
    }
}

