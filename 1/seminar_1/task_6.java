//Задание №6 (доп)
//Реализовать функцию возведения числа а в степень b. a, b из Z.
//Сводя количество выполняемых действий к минимуму.
//Пример 1: а = 3, b = 2, ответ: 9
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1

package seminar_1;

public class task_6 {
    public static void main(String[] args) {
        System.out.println(exp_rec_1(0,0));
        System.out.println(exp_rec_2(0,1));
        System.out.println(exp_for(0,0));
    }

    public  static double exp_rec_1(int a, int b) {
        if (b == 0 && a == 0) return 0;
        if (b == 0) return 1;
        if (b < 0) return 1/(a*exp_rec_1(a, -b -1 ));
        return a*exp_rec_1(a, b-1);
    }

    public  static double exp_rec_2(int a, int b) {
        if (b == 0) return 1;
        if (b < 0) return exp_rec_1(1/a, -b);
        double res = exp_rec_2(a, b / 2);
        return b % 2 == 0 ? res * res: res * res * a;
    }

    public static double exp_for(int a, int b) {
        double result = 1;
        if (a == 0) result = 0;
        double a_ = (double)a;
        if (b < 0) {
            if (a_ != 0) a_ = 1 / a_;
            else result = 0;
            b = -b;
        }
        for (int i = 0; i < b; i++) {
            result = result * a_;
        }
        return result;
    }
}

