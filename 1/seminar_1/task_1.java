package seminar_1;
import java.time.LocalTime;
import java.util.Scanner;


//Задание №1
//Написать программу, которая запросит пользователя ввести <Имя> в консоли.
//Получит введенную строку и выведет в консоль сообщение
//“Привет, <Имя>!”
//В консоли запросить имя пользователя. В зависимости от
//текущего времени, вывести приветствие вида
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59

public class task_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("name: ");
        String name = iScanner.nextLine();
        LocalTime time = LocalTime.now();
        int hour = time.getHour();
        if ((hour < 12) && (hour >= 5)) {
            System.out.printf("Доброе утро, %s!", name);
        }
        else if ((hour >= 12) && (hour < 18)) {
            System.out.printf("Добрый день, %s!", name);
        }
        else if ((hour >= 18) && (hour < 23)) {
            System.out.printf("Доброго вечера, %s!", name);
        }
        else {
            System.out.printf("Доброй ночи, %s!", name);
        }
        iScanner.close();
    }
}
