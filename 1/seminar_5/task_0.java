package seminar_5;

import java.util.HashMap;
import java.util.Map;

//Задание №0
//        Создать структуру для хранения Номеров паспортов и Фамилий
//        сотрудников организации.
//        123456 Иванов
//        321456 Васильев
//        234561 Петрова
//        234432 Иванов
//        654321 Петрова
//        345678 Иванов
//        Вывести данные по сотрудникам с фамилией Иванов.
public class task_0 {
    public static void main(String[] args) {
//        Map<Integer, String> phoneBook = new HashMap<>();
//        phoneBook.put( 123456, "Иванов");
//        phoneBook.put( 321456, "Васильев");
//        phoneBook.put( 234561, "Петрова");
//        phoneBook.put( 234432, "Иванов");
//        phoneBook.put( 654321, "Петрова");
//        phoneBook.put( 345678, "Иванов");
//        for (var item: phoneBook.entrySet()) {
//            if (item.getValue().equals("Иванов"))
//                System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
//        }
        userData userData = new userData();
        userData.addUser("123456","Иванов");
        userData.addUser("321456","Васильев");
        userData.addUser("234561","Петрова");
        userData.addUser("234432","Иванов");
        userData.addUser("654321","Петрова");
        userData.addUser("345678","Иванов");
        System.out.println(userData.findUserByName("Иванов"));
    }
}
