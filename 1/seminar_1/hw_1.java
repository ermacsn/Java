//Вычислить n-ое треугольного число(сумма чисел от 1 до n).
package seminar_1;
class Answer {
    public int countNTriangle(int n) {
        // Введите свое решение ниже
    return (n * (n + 1)) / 2;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw_1{
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            n = 5;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // Вывод результата на экран
        Answer ans = new Answer();
        int resume_res = ans.countNTriangle(n);
        System.out.println(resume_res);
    }
}