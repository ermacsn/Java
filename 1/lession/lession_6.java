package lession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class lession_6 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set.contains(2));
        set.add(null);
        System.out.println(set.size());
        System.out.println(set);
        set.remove(1);
        for (var item : set)
            System.out.println(item);
        set.clear();;
        System.out.println(set);

        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new  HashSet<Integer>(a);
        u.addAll(b);
        var r = new HashSet<Integer>(a);
        r.retainAll(b);
        var s = new HashSet<Integer>(a);
        s.removeAll(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(u);
        System.out.println(r);
        System.out.println(s);
        Boolean res = a.addAll(b);
        System.out.println(res);
    }
}
