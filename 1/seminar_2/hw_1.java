//1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
//используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
package seminar_2;

import java.util.ArrayList;
import java.util.HashMap;
class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        StringBuilder result = new StringBuilder();
        String[] name_params = {"name", "country", "city", "age"};
        result.append(QUERY);
        StringBuilder sb = new StringBuilder(PARAMS.strip());
        ArrayList<StringBuilder> array = new ArrayList<>();
        for (int i = 0; i < name_params.length; i++) {
            array.add(Parse(sb, name_params[i]));
        }
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).indexOf("null") == -1) {
                if (i != 0) result.append(" and ");
                result.append(array.get(i));
            }
        }
        return result;
    }

    static StringBuilder Parse (StringBuilder sb, String str) {
        StringBuilder result = new StringBuilder(str);
        result.append("= '");
        int index = sb.indexOf(str) + str.length() + 3;
        for (int i = index; i < sb.length(); i++) {
            if (sb.charAt(i) != '"') result.append(sb.charAt(i));
            else break;
        }
    return  result.append("'");
    }
}


    public class hw_1 {
        public static void main(String[] args) {
            String QUERY = "";
            String PARAMS = "";

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                QUERY = "select * from students where ";
                PARAMS = "{\"name\":\"Ivanov\", \"country\":\"null\", \"city\":\"Moscow\", \"age\":\"42\"} ";
            }
            else{
                QUERY = args[0];
                PARAMS = args[1];
            }

            Answer ans = new Answer();
            System.out.println(ans.answer(QUERY, PARAMS));
        }
    }
