//Задание №2
//        1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для
//        приложения, которое является
//        а) информационной системой ветеринарной клиники
//        б) архивом выставки котов
//        в) информационной системой Театра кошек Ю. Д. Куклачёва
//        Можно записать в текстовом виде, не обязательно реализовывать в java.

package seminar_6;

import java.util.HashSet;

import static seminar_6.Cat.findByAge;

public class task_2 {
    public static void main(String[] args) {
        HashSet<Cat> cats = new HashSet<>();
        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.age = 10;
        cat1.poroda = "jjjj";
        cat1.weight = 3.5;
        cat1.ownerName = "llll";

        Cat cat2 = new Cat();
        cat2.name = "Бсик";
        cat2.age = 10;
        cat2.poroda = "jj";
        cat2.weight = 0.5;
        cat2.ownerName = "llll";

        Cat cat3 = new Cat();
        cat3.name = "Басик";
        cat3.age = 1;
        cat3.poroda = "jjj";
        cat3.weight = 3;
        cat3.ownerName = "lll";

        Cat cat4 = new Cat();
        cat4.name = "Басик";
        cat4.age = 1;
        cat4.poroda = "jjj";
        cat4.weight = 3;
        cat4.ownerName = "lll";

        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        printSet(cats);
        System.out.println(cat3.equals(cat2));
        System.out.println(cat1.hashCode());
        printSet(findByAge(cats, 2));
    }

    static void printSet(HashSet<Cat> cats) {
        for (Cat cat: cats)
            System.out.println(cat);
    }
}
