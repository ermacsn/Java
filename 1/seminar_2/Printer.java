package seminar_2;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;

    public static void sort(int[] mas) {
        int max = mas[0];
        Date date = new Date();
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        log = new File("log.txt");
        try (FileWriter fileWriter = new FileWriter(log)) {
            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas.length - i - 1; j++) {
                    if (mas[j] > mas[j + 1]) {
                        max = mas[j + 1];
                        mas[j + 1] = mas[j];
                        mas[j] = max;
                    }
                }
                fileWriter.write(formater.format(date));
                fileWriter.write(" ");
                fileWriter.write(Arrays.toString(mas));
                fileWriter.write("\n");
            }
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class Printer {
    public static void main(String[] args) {
        int[] arr = {};
        if (args.length == 0) {
            arr = new int[]{9, 4, 8, 3, 1};
        } else {
            arr = Arrays.stream(args[0].split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        BubbleSort ans = new BubbleSort();
        ans.sort(arr);

        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}