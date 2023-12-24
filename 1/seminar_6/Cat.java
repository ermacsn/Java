package seminar_6;

import java.util.HashSet;
import java.util.List;

public class Cat {
    String name;
    double weight;
    int age;
    String  poroda;
    String ownerName;
    List<String> healthHistory;


    @Override
    public String toString()  {
        return "name: " + name + ", age: " + age + ", poroda: " + poroda + ", owner: " + ownerName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)  return true;
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return name.equals(cat.name) && age == cat.age && poroda.equals(cat.poroda) && ownerName.equals(cat.ownerName);
        }
    return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 56 * age + 10 * poroda.hashCode() + 9 * ownerName.hashCode();
    }

    static HashSet<Cat> findByAge(HashSet<Cat> cats, int minAge) {
        HashSet<Cat> res = new HashSet<>();
        for (Cat cat: cats) {
            if (cat.age >= minAge)
                res.add(cat);
        }
    return res;
    }
}
