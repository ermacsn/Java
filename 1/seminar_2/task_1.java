//Задание №1
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N, которая
//состоит из чередующихся символов c1 и c2, начиная с c1.

package seminar_2;

public class task_1 {
    public static void main(String[] args) {
    char c1 = 'a';
    char c2 = 'b';
    int N = 0;
    System.out.println(result_str(N, c1, c2));

    }
    static String result_str(int N, char c1, char c2){
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        int n1 = (int)((N + 1) / 2);
        int n2 = N / 2;
        for (int i = 0; i < n1; i++) {
            sb.append(c1);
            if (i < n2) sb.append(c2);
        }
    return sb.toString();
    }
}

