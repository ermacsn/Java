//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//        Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//        Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
//        Работу сдать как обычно ссылкой на гит репозиторий
//        Частые ошибки:
//        1. Заставляете пользователя вводить все существующие критерии фильтрации
//        2. Невозможно использовать более одного критерия фильтрации одновременно
//        3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
//        4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или добавить еще ноутбук, то программа начинает работать некорректно
package seminar_6;


import java.util.*;

public class result_hw {
    static HashSet<NoteBook> setNoteBook = new HashSet<>(); // Множество ноутбуков
    public static void main(String[] args) {
        setNoteBook.add(new NoteBook("Asus", "Asus Notebook 1", 4, 8, 1, "Windows 8", "black"));
        setNoteBook.add(new NoteBook("Asus", "Asus Notebook 2", 8, 16, 1.5, "Windows 10", "orange"));
        setNoteBook.add(new NoteBook("HP", "HP Notebook 1", 8, 8, 1, "Windows 8", "white"));
        setNoteBook.add(new NoteBook("HP", "HP Notebook 2", 16, 16, 2, "Ubuntu", "black"));
        setNoteBook.add(new NoteBook("HP", "HP Notebook 3", 4, 16, 1.5, "Windows 10", "yellow"));
        setNoteBook.add(new NoteBook("Lenovo", "Lenovo Notebook 1", 4, 8, 1, "Windows 8", "black"));
        setNoteBook.add(new NoteBook("Lenovo", "Lenovo Notebook 2", 12, 16, 2, "Windows 10", "silver"));
        setNoteBook.add(new NoteBook("Apple", "Macbook", 4, 8, 1, "MacOS", "white"));
        setNoteBook.add(new NoteBook("Acer", "Acer Notebook", 4, 8, 1, "Windows 10", "black"));
        setNoteBook.add(new NoteBook("Samsung", "Samsung Notebook", 8, 16, 2, "Windows 10", "silver"));

        HashMap<Integer, HashMap<String, String>> operations = new HashMap<>(); // Перечень фильтров
        HashMap<Integer, HashMap<String, String>> operationsSelected = new HashMap<>(); // Выбранные фильтры

        // Определяем параметры фильтров
        HashMap startFind = new HashMap();
        startFind.put("name", "Поиск");
        operations.put(0, startFind);

        HashMap filterBrand = new HashMap();
        filterBrand.put("name", "Наименование бренда");
        filterBrand.put("valueText", "Введите наименование бренда");
        filterBrand.put("value", "");
        operations.put(1, filterBrand);

        HashMap filterName = new HashMap();
        filterName.put("name", "Наименование ноутбука");
        filterName.put("valueText", "Введите наименование ноутбука");
        filterBrand.put("value", "");
        operations.put(2, filterName);

        HashMap filterCore = new HashMap();
        filterCore.put("name", "Количество ядер ЦПУ");
        filterCore.put("valueText", "Введите минимальное количество ядер");
        filterCore.put("value", "");
        operations.put(3, filterCore);

        HashMap filterRAM = new HashMap();
        filterRAM.put("name", "Объем оперативной памяти, гБ");
        filterRAM.put("valueText", "Введите минимальный объем оперативной памяти, гБ");
        filterRAM.put("value", "");
        operations.put(4, filterRAM);

        HashMap filterROM = new HashMap();
        filterROM.put("name", "Объем жесткого диска, тБ");
        filterROM.put("valueText", "Введите минимальный объем жесткого диска, тБ");
        filterROM.put("value", "");
        operations.put(5, filterROM);

        HashMap filterOS = new HashMap();
        filterOS.put("name", "Операционная система");
        filterOS.put("valueText", "Введите наименование операционной системы");
        filterOS.put("value", "");
        operations.put(6, filterOS);

        HashMap filterColor = new HashMap();
        filterColor.put("name", "Цвет");
        filterColor.put("valueText", "Введите цвет ноутбука");
        filterColor.put("value", "");
        operations.put(7, filterColor);


        // Получаем фильтры
        boolean exit = true; //выход
        Scanner iScanner = new Scanner(System.in);
        while (exit) {
            System.out.println("Введите цифру, соответствующую необходимому критерию: ");
            for (Integer filter : operations.keySet()) {
                System.out.println(filter + " - " + operations.get(filter).get("name"));
            }
            String numberString = iScanner.nextLine();
            try {
                int numberInteger = Integer.parseInt(numberString);
                if (numberInteger != 0) {
                    System.out.println(operations.get(numberInteger).get("valueText"));
                    String value = iScanner.nextLine();
                    operations.get(numberInteger).put("value", value);
                    operationsSelected.put(numberInteger, operations.get(numberInteger));
                }
                else {
                    exit = false;
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        for (NoteBook np: find(operationsSelected)) {
            System.out.println(np);
        }
    }


    static HashSet<NoteBook> find(HashMap<Integer, HashMap<String, String>> filters) {
        HashSet<NoteBook> result = new HashSet<>(setNoteBook);

        String valueStr = "";
        for (NoteBook nb: setNoteBook) {
            for (Integer key: filters.keySet()) {
                try {
                    valueStr = filters.get(key).get("value");
                    if (filters.get(key).get("name").equals("Наименование бренда"))
                        if (!Objects.equals(valueStr.toLowerCase(), nb.brand.toLowerCase()))  result.remove(nb);
                    if (filters.get(key).get("name").equals("Наименование ноутбука"))
                        if (!Objects.equals(valueStr.toLowerCase(), nb.name.toLowerCase()))  result.remove(nb);
                    if (filters.get(key).get("name").equals("Количество ядер ЦПУ"))
                        if (Integer.parseInt(valueStr) >= nb.coreCPU)  result.remove(nb);
                    if (filters.get(key).get("name").equals("Объем оперативной памяти, гБ"))
                        if (Integer.parseInt(valueStr) >= nb.RAM)  result.remove(nb);
                    if (filters.get(key).get("name").equals("Объем жесткого диска, тБ"))
                        if (Double.parseDouble(valueStr) >= nb.ROM)  result.remove(nb);
                    if (filters.get(key).get("name").equals("Операционная система"))
                        if (!Objects.equals(valueStr.toLowerCase(), nb.OS.toLowerCase()))  result.remove(nb);
                    if (filters.get(key).get("name").equals("Цвет"))
                        if (!Objects.equals(valueStr.toLowerCase(), nb.color.toLowerCase()))  result.remove(nb);
                } catch (NumberFormatException e) {
                        e.printStackTrace();
                }

            }
        }
        return result;
    }

}

