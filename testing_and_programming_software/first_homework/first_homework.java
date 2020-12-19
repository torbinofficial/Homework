package first_homework;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


public class first_homework {
    public static void main(String[] args) {
        System.out.println(RecursiveDigitalRoot(715));
        //System.out.println(NextBiggerNumber(111));
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
    static int RecursiveDR(int number) {
        if (number < 10)
            return number;
        return number%10 + RecursiveDR(number/10);
    }

    static int RecursiveDigitalRoot(int number) {
        while (number > 9) {
            number = RecursiveDR(number);
        }
        return number;
    }

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

    public static int getCountsOfDigits(long number) {
        return(number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }

    //Extra Task 1 (No tests)
    static int NextBiggerNumber(int number) {

        int size = getCountsOfDigits(number);
        Integer[] numbers = new Integer[size];
        boolean Swaped = false;
        for (int i = numbers.length - 1; i >= 0; i--) {
            numbers[i] = number%10;
            number /=10;
        }

        for (int i = 0; i + 1 < numbers.length; i++) {
            if (numbers[i] < numbers[i + 1] ) {
                var temp = numbers[i + 1];
                numbers[i + 1] = numbers[i];
                numbers[i] = temp;
                Swaped = true;
                break;
            }
        }
        if (Swaped) {
            int result = 0;
            for (int i = 0; i < numbers.length; i++ ) {
                result *= 10;
                result += numbers[i];
            }
            return result;
        } else {
            return -1;
        }
    }
}
