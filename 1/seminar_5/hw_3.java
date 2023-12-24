package seminar_5;
import  java.util.Arrays;

class HeapSort {
    public static void buildTree(int[] tree, int sortLength) {
        // Построение кучи (перегруппируем массив)
        for (int i = sortLength / 2 - 1; i >= 0; i--)
            heapSort(tree, sortLength, i);

        // Один за другим извлекаем элементы из кучи
        for (int i=sortLength-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = tree[0];
            tree[0] = tree[i];
            tree[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapSort(tree, i, 0);
        }

    }
    static void heapSort(int[] sortArray, int sortLength, int i)
    {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < sortLength && sortArray[l] > sortArray[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < sortLength && sortArray[r] > sortArray[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i)
        {
            int swap = sortArray[i];
            sortArray[i] = sortArray[largest];
            sortArray[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapSort(sortArray, sortLength, largest);
        }
    }
}

// Не удаляйте и не меняйте метод Main!
public class hw_3 {
    public static void main(String[] args) {
        int[] initArray;

        if (args.length == 0) {
            initArray = new int[]{17, 32, 1, 4, 25, 17, 0, 3, 10, 7, 64, 1};
        } else {
            initArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
        }

        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        HeapSort.buildTree(initArray, initArray.length);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}