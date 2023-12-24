package seminar_3;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

class Answer_3 {
    public static void analyzeNumbers(Integer[] arr) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Minimum is " + Collections.min(list));
        System.out.println("Maximum is " + Collections.max(list));
        double sum = 0;
        for (int i : list) {
            sum += i ;
        }
        System.out.println("Average is " + sum / list.size());
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw_3{
    public static void main(String[] args) {
        Integer[] arr = {};

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        }
        else{
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }

        Answer_3 ans = new Answer_3();
        ans.analyzeNumbers(arr);
    }
}