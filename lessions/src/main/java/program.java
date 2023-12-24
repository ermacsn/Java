import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import  java.io.IOException;

public class program {
    public static void main(String[] args) throws Exception {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.printf("name: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!", name);
//        System.out.println();
//        System.out.printf("int a: ");
//        int x = iScanner.nextInt();
//        System.out.printf("double a: ");
//        double y = iScanner.nextDouble();
//        System.out.printf("%d + %f = %f", x,y, x + y);
//        System.out.println();
//        System.out.printf("int a: ");
//        boolean flag = iScanner.hasNextInt();
//        System.out.println(flag);
//        int i = iScanner.nextInt();
//        System.out.println(i);
//        float pi = 3.1415f;
//        System.out.printf("%f\n", pi);
//        System.out.printf("%.2f\n", pi);
//        System.out.printf("%.3f\n", pi);
//        System.out.printf("%e\n", pi);
//        System.out.printf("%.2e\n", pi);
//        System.out.printf("%.3e\n", pi);
//        iScanner.close();
//        try (FileWriter fw = new FileWriter("file.txt", false)){
//            fw.write("line 1");
//            fw.append('\n');
//            fw.append('2');
//            fw.write("line 3");
//            fw.flush();
//        } catch (IOException ex) {
//            System.out.println((ex.getMessage()));
//        }
//        String s = "qwe";
//        int a =123;
//        String q = s + a;
//        System.out.println(q);
//
//        for (int i = 0; i < 10; i++) {
//            if (i % 2 ==0 ) break;
//            System.out.println(i);
//        }
//
//            FileReader fr = new FileReader("file.txt");
//            int c;
//            while ((c = fr.read()) != -1) {
//                char ch = (char) c;
//
//                    System.out.print(ch);
//
//            }
//
//        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//        String str;
//        while ((str = br.readLine()) != null) {
//            System.out.printf("== %s ==\n", str);
//        } br.close();
//        Scanner iScanner = new Scanner(System.in);
//        System.out.println("Степень многочлена: ");
//        String exp_str = iScanner.nextLine();
//        int exp = Integer.parseInt(exp_str);
//        int[] arr = new int[exp];
//        String s = "";
//        int y = 0;
//        Random rand = new Random();
//        for (int i = exp ; i > 0; i--) {
//            y = rand.nextInt(101);
//            s = s + Integer.toString(y) + "x^" + Integer.toString(i) + " + ";
//        }
//        s = s + Integer.toString(rand.nextInt(101));
//        System.out.println(s);
//        for (int i = exp; i > 0; i--) {
//            y = rand.nextInt(101);
//            System.out.printf("%d^%d + ", y, i);
//        }
//        System.out.println(Integer.toString(rand.nextInt(101)));

        write_file("file1.txt", "3*x^4 + 6*x^3 + 67*x^2 + 43*x^1 + 34" );
        write_file("file2.txt", "6*x^3 + 67*x^2 + 43*x^1 + 34");

        String solut1 = read_file("file1.txt");
        System.out.printf("%s\n", solut1);
        String solut2 = read_file("file2.txt");
        System.out.printf("%s\n", solut2);

        String str1 = "3*x^4 + 6*x^3 + 67*x^2 + 43*x^1 + 34";
        str1 = str1.replace(" + "," ");
        System.out.printf("%s\n", str1);
        String[] arr1 =  str1.split(" ");
        System.out.printf("%s\n", arr1.length);

        String str2 = "6*x^3 + 67*x^2 + 43*x^1 + 34";
        str2 = str2.replace(" + "," ");
        System.out.printf("%s\n", str2);
        String[] arr2 =  str2.split(" ");
        System.out.printf("%s\n", arr2.length);
        String[] arr_1 = new String [arr1.length];
        String[] arr_2 = new String [arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr_1[i] =
        }
    }

    public static void write_file(String file_name, String arr) throws Exception {
        try (FileWriter fw = new FileWriter(file_name, false)) {
            fw.write(arr);
            fw.flush();
        } catch (IOException ex) {
            System.out.println((ex.getMessage()));
        }
    }

    public static String read_file(String file_name) throws Exception {
        BufferedReader br1 = new BufferedReader(new FileReader(file_name));
        String str;
        str = br1.readLine();
        br1.close();
        return str;
    }

    public static void pars(String str) throws Exception {
        int i = 0;
        while (str.charAt(i) != '\n') {
            i ++;



        }
    }

}
