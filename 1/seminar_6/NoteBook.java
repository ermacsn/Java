package seminar_6;

public class NoteBook {
    String brand; // Наименование производителя
    String name; // Наименование ноутбука
    int coreCPU; // Количество ядер ЦПУ
    double RAM; // Объем оперативной памяти, гБ
    double ROM; // Объем жесткого диска, тБ
    String OS; // Операционная система
    String color; // Цвет

    public NoteBook(String _brand, String _name, int _coreCPU, double _RAM, double _ROM, String _OS, String _color) {
        brand = _brand;
        name = _name;
        coreCPU = _coreCPU;
        RAM = _RAM;
        ROM = _ROM;
        OS = _OS;
        color = _color;
    }

    @Override
    public String toString() {
        return "Бренд: " + brand + "; наименование: " + name + "; кол-во ядер ЦПУ: " + coreCPU +
                "; объем оперативной памяти: " + RAM + " гБ; объем жесткого диска: " + ROM +
                " тБ; операционная система: " + OS + "; цвет: " + color + ".";
    }
}
