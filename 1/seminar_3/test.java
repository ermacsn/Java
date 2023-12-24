package seminar_3;
import java.util.ArrayList;
import java.util.List;
public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int a = 5;
        String s = "fff";
        tesst(list, a, s);
        tesst(list, a, s) ;
        System.out.println(list);
        System.out.println(a);
        System.out.println(s);
    }
    static void tesst(List<Integer> list, int a, String s){
        a =+ 1  ;
        list.add(a);
        s = "gg";
    }
}
