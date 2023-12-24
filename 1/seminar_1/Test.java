package seminar_1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Укажите возраст");
        int age = sc1.nextInt();
        sc1.close();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Укажите ваше имя");
        String name = sc2.nextLine();
        System.out.println(name + ": " + age);
    }
}

