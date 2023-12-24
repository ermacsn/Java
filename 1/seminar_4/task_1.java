//Задание №1
//        Реализовать консольное приложение, которое:
//        1. Принимает от пользователя строку вида
//        text~num
//        2. Нужно рассплитить строку по ~, сохранить text в связный список на
//        позицию num.
//        3. Если введено print~num, выводит строку из позиции num в связном
//        списке и удаляет её из списка.


package seminar_4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        List<String> llist = new LinkedList<>();
        String [] span = new String[2];
        String text = "";
        int num = 0;
        while (true) {
            System.out.println("Введите строку вида text~num или print~num: ");
            String answer = iScanner.nextLine();
            if (answer.equals("end")) break;
            span = answer.split("~");
            text = span[0];
            num = Integer.parseInt(span[1]);
            if (text.equals("print") && !llist.isEmpty()) {
                System.out.println(llist.remove(num));
            }
            else {
                if (num > llist.size()) {
                    for (int i = 0; i <= num; i++) {
                        llist.add("");
                    }
                }
                llist.set(num, text);
            }
            System.out.println(llist);
        }
    }
}
