package seminar_1;
class Answer_2 {
    public void printPrimeNums(){
        for (int i = 2; i <= 1000; i++) {
            boolean flag = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(i);
        }

    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class hw_2{
    public static void main(String[] args) {

        Answer_2 ans = new Answer_2();
        ans.printPrimeNums();
    }
}

