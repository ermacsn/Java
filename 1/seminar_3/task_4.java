//Задание №4.
//Каталог товаров книжного магазина сохранен в виде двумерного
//списка List<ArrayList<String>> так, что на 0-й позиции каждого
//внутреннего списка содержится название жанра, а на остальных
//позициях - названия книг. Напишите метод для заполнения данной
//структуры.

package seminar_3;

import java.util.ArrayList;
import java.util.Scanner;

public class task_4 {
    public static ArrayList<ArrayList<String>> catalog;
    public static void main(String[] args) {
         catalog = new  ArrayList<ArrayList<String>>();
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите жанр книги или х для выхода: ");
            String ganreBook = iScanner.nextLine();
            if (ganreBook.equals("x")) break;;
            System.out.println("Введите название книги или х для выхода: ");
            String nameBook = iScanner.nextLine();
            if (nameBook.equals("x")) break;
            addBook(ganreBook, nameBook);
        }
    }
    static void addBook(String ganreBook, String nameBook) {
        ArrayList<String> listBook = new ArrayList<>();
        if (catalog.isEmpty()) {
            listBook.add(ganreBook);
            listBook.add(nameBook);
            catalog.add(listBook);
        }
        else {
            boolean flag = true;
            for (ArrayList<String> Book: catalog) {
                if (Book.get(0).equals(ganreBook)){
                    Book.add(nameBook);
                    flag = false;
                }
            }
            if (flag) {
                listBook.add(ganreBook);
                listBook.add(nameBook);
                catalog.add(listBook);
            }
        }
        System.out.println(catalog);
    }
}
