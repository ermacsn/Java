package seminar_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class userData {
    Map<String, String> userData = new HashMap<>();
    void addUser(String number, String name) {
        userData.put(number, name);
    }
    
    String findUserByName(String name) {
        StringBuilder result = new StringBuilder();
        for (String key: userData.keySet()) {
            if (name.equals(userData.get(key))) {
                result.append(key).append(": ");
                result.append(userData.get(key)).append("\n");
            }
        }
        return result.toString().trim();
    }
    
}
