package lession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class lession_3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8);
        for (int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            System.out.println(col.next());
        //    col.next();
        //    col.remove();
        }


//        ArrayList<Integer> list = new ArrayList<Integer>();
//        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<Integer> list2 = new ArrayList<>(10);
//        ArrayList<Integer> list3 = new ArrayList<>(list2);
//        ArrayList list_1 = new ArrayList();
//        list.add(2809);
//        list_1.add("xxxx");
//        for (Object o: list) {
//            System.out.println(o);
//        }
//        for (Object O: list_1) {
//            System.out.println(O);
//        }
     }
}
//        Object o = 1; GetType(o);
//        o = 1.2; GetType(o);
//        System.out.println(Sum(1,2));
//        System.out.println(Sum(1.0,2));
//        System.out.println(Sum(1,2.0));
//        System.out.println(Sum(1.0,2.0));
//        int[] a = new int[] {1, 9};
//        int[] b = new int[3];
//        System.arraycopy(a, 0, b, 0, a.length);
//        for (int i: a) {
//            System.out.printf("%d ", i);}
//        System.out.println();
//        for (int j: b) {
//            System.out.printf("%d ", j);
//        int[] a = new int[] {0, 9};
//        for (int i : a) {
//            System.out.printf("%d ", i);
//        }
//        a = AddItem(a, 2);
//        a = AddItem(a, 3);
//        System.out.println();
//        for (int j : a) {
//            System.out.printf("%d ", j);
//        }
//    }

//    static int[] AddItem(int[] array, int item) {
//        int length = array.length;
//        int[] temp = new int[length + 1];
//        System.arraycopy(array,0, temp, 0, length);
//        temp[length] = item;
//        return  temp;
//    }
//    private static void GetType(Object o) {
//        System.out.println(o.getClass().getName());
//    }
//
//    static Object Sum(Object a, Object b) {
//        if (a instanceof Double && b instanceof Double) {
//            return (Object) ((Double) a + (Double) b);
//        } else if (a instanceof Integer && b instanceof Integer) {
//            return (Object) ((Integer) a + (Integer) b);
//        } else return 0;
//    }
//}
