import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


public class first_homework {
    public static void main(String[] args) {

        //var x = new String("sttressed");
        System.out.println(SortFriends("Fred:Corwill;Barney:Tornzbull;Adam:Corwill"));
    }

    //Task1
    static List<Integer> GetIntegersFromList(List<?> arr) {
        List<Integer> result = new ArrayList<Integer>();
        for (var x : arr)
            if (x instanceof Integer) {
                result.add((Integer) x);
            }
        return result;
    }

    //Task2
    static String FirstNonRepeatingLetter(String str)   {
        //Я очень надеюсь, что тут не будет строк на >100'000 элементов, т.к. способ довольно медленный
        String s = str.toLowerCase();
        List<Character> elements = new ArrayList<Character>();
        for (int i = 0; i < s.length(); i++) {
            elements.add(s.charAt(i)); 
        }
        while (elements.size() != 0) {
            //Мы всегда удаляем элементы, так что можно смело брать первый (0)
            var x = elements.get(0);

            //Очистка повторений
            elements.remove(x);
            if (!elements.contains(x)) {
                return String.valueOf(x);
            } else {
                while(elements.contains(x)) {
                    elements.remove(x);
                }
            }
        }
        return "";
    }

    //Task3
    static int DigitalRoot(int number) {
        int result = 0;
        while (number != 0) {
            result += number%10;
            if (number < 10 && result > 9) {
                number = result;
                result = 0;
            } else {
                number = number/10;
            }
        }
        return result;
    }
    //Count the number of pairs in the array, the sum of which will give target
    //Task4

    static int CountPairs(List<Integer> list, final int target) {
        int result = 0;
        for (int i = 0; i < list.size(); i++)
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(i) + list.get(j) == target)
                    result++;
        return result;
    }
    //Task5
    static String SortFriends(String s) {
        s = s.toUpperCase();
        String[] str = s.split(";");
        SortedSet<String> results = new TreeSet<>();
        for (int i = 0; i < str.length; i++) {
            String[] person = str[i].split(":");
            results.add("(" + person[1] + ", " + person[0] +")");
        }
        return String.join("", results);
    }
}
