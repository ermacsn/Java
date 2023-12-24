package seminar_1;
//Задание №2
//Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести
//максимальное количество подряд идущих 1.
public class task_2 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};
            int count = 0;
            int g_count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                if (g_count < count) g_count = count;
            }else {
                count = 0;
            }
        }
        System.out.println(g_count);
    }
}
