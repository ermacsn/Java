//Задание №3
//Напишите метод, который принимает на вход строку (String) и
//определяет являться ли строка палиндромом (возвращает boolean значение)

package seminar_2;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        System.out.println("Введите строку: ");
        sb = new StringBuilder(iScanner.nextLine());

        System.out.println(sb1);
        for (int i = sb.length() - 1; 0 <= i ; i--) {
            sb2.append(sb.charAt(i));
        }

        String str = sb.toString();

        String str2 = sb2.toString();
        System.out.println(str);
        System.out.println(str2);

        if (str.equalsIgnoreCase(str2)) System.out.println("Палиндром");
        System.out.println(isPalindrom(sb));


    }

    static boolean isPalindrom(StringBuilder sb) {
        int size = sb.length();
        boolean result = true;
        for (int i = 0; i < size / 2; i++) {
            if (sb.charAt(i) != sb.charAt(size - 1 -i)) {
                result = false;
                break;
            }
        }
        return result;
    }
}

