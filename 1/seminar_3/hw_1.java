package seminar_3;
import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        if (a == null) {
            return null;
        }
        if (a.length < 2) {
            return a;
        }
        int[] arrayB = new int[a.length / 2];
        System.arraycopy(a, 0, arrayB, 0, a.length / 2);

        int[] arrayC = new int[a.length - a.length / 2];
        System.arraycopy(a, a.length / 2, arrayC, 0, a.length - a.length / 2);

        arrayB = mergeSort(arrayB);
        arrayC = mergeSort(arrayC);

        return mergeArray(arrayB, arrayC);
    }

    public static int[] mergeArray(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int n = a1.length;
        int m = a2.length;
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a1[i] <= a2[j]) {
                res[k] = a1[i];
                i++; }
            else {
                res[k] = a2[j];
                j++; }
            k++; }
        while (i < n) {
            res[k] = a1[i];
            i++;
            k++; }
        while (j < m) {
            res[k] = a2[j];
            j++;
            k++; }
        return res;
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw_1{
    public static void main(String[] args) {
        int[] a;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}