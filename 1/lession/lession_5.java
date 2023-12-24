package lession;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class lession_5 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        Map<Integer, String> db1 = new HashMap<>(9);
        Map<Integer, String> db2 = new HashMap<>(9, 0.7f);
        db.putIfAbsent(1, "one");
        db.put(2, "two");

        db.put(null, "null");
        System.out.println(db);
        System.out.println(db.get(44));
        db.remove(null);
        System.out.println(db);
        System.out.println(db.containsValue("one"));
        System.out.println(db.containsValue(1));
        System.out.println(db.containsKey("one"));
        System.out.println(db.containsKey(1));
        System.out.println(db.keySet());
        System.out.println(db.values());
        for (var item: db.entrySet()) {
            System.out.printf("[%d: %s]\n", item.getKey(), item.getValue());
        }
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1,"one");
        System.out.println(tMap);
        tMap.put(6, "six");
        System.out.println(tMap);
        tMap.put(4,"four");
        System.out.println(tMap);
        tMap.put(3, "three");
        System.out.println(tMap);
        tMap.put(2, "two");
        System.out.println(tMap);
        System.out.println(tMap.descendingKeySet());
        System.out.println(tMap.descendingMap());
        System.out.println(tMap.headMap(3));
        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "one one");
        linkmap.put(22, "two two");
        linkmap.put(33, "three three");
        System.out.println(linkmap);
        Map<Integer, String> map = new HashMap<>();
    }
}
