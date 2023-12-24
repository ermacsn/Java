//Задание №2.1.
//Заполнить список названиями планет Солнечной
//системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его
//повторений в списке.
//Задание состоит из двух блоков
//Задание №2.2 (если выполнено первое задание)
//Пройти по списку из предыдущего задания и удалить
//повторяющиеся элементы.
package seminar_3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class task_2 {
    public static void main(String[] args) {
        String[] Planets = new String[]{"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун", "Плутон"};
        ArrayList<String> solar= createSolarSystem(Planets);
        System.out.println(solar);
        for (String planeta: Planets) {
            int count = 0;
            for (String sPlaneta: solar) {
                if (planeta.equals(sPlaneta)) count ++;
            }
            System.out.printf("%s: %d", planeta, count);
            System.out.println();
        }

        for (String i: Planets) {
            int count = Collections.frequency(solar, i);
            System.out.println(i + ": " + count);
        }
        HashSet<String> hplanets = new HashSet<>(solar);
        System.out.println(hplanets);

        ArrayList<Object> list_6 = new ArrayList<>();
    }

    static  ArrayList<String> createSolarSystem(String[] planets){
       ArrayList<String> result = new ArrayList<>();
        Random randPlanet = new Random();
        Random sizeSolarSystem = new Random();
        for (int i = 0; i < sizeSolarSystem.nextInt(100); i++) {
            result.add(planets[randPlanet.nextInt(8)]);
        }
        return result;
    }
}
