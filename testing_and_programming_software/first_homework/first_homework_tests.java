package first_homework;

import java.util.ArrayList;
import java.util.Arrays;


public class first_homework_tests {
    public static void main(String[] args) {
        System.out.println("TestTaskOne: " + TestTaskOne());
        System.out.println("TestTaskTwo: " + TestTaskTwo());
        System.out.println("TestTaskThree: " + TestTaskThree());
        System.out.println("TestTaskFour: " + TestTaskFour());
        System.out.println("TestTaskFive: " + TestTaskFive());
    }
    static int TestTaskOne() {
        var result1 = first_homework.GetIntegersFromList(Arrays.asList(1, 2, 6, "1", 5, "312", "bas"));
        if (!result1.containsAll(Arrays.asList(1, 2, 6, 5)) )
            return -1;

        var result2 = first_homework.GetIntegersFromList(Arrays.asList("312", "bas"));
        if (!result2.containsAll(new ArrayList<Integer>()) )
            return -2;
        return 0;
    }

    static int TestTaskTwo() {
        var result1 = first_homework.FirstNonRepeatingLetter("sTreSS");
        if (!result1.equals("t") )
            return -1;
        var result2 = first_homework.FirstNonRepeatingLetter("aaaaaaabbbbbbccccccccccccccdddddddeeeeeeeeeefggggggggggggg"); 
        if (!result2.equals("f"))
            return -2;
        return 0;
    }

    static int TestTaskThree() {
        var result1 = first_homework.DigitalRoot(256);
        if (result1 != 4)
            return -1;
        var result2 = first_homework.DigitalRoot(111111111); 
        if (result2 != 9)
            return -2;
        return 0;
    }

    static int TestTaskFour() {
        var result1 = first_homework.CountPairs(Arrays.asList(1, 2, 3, 4, 2, 4, 0), 4);
        if (result1 != 4)
            return -1;
        var result2 = first_homework.CountPairs(Arrays.asList(1, 3, 6, 2, 2, 0,  4, 5), 5);
        if (result2 != 4)
            return -2;
        return 0;
    }
    static int TestTaskFive() {
        var result1 = first_homework.SortFriends("Fred:Corwill;Barney:Tornzbull;Adam:Corwill");
        if (!result1.equals("(CORWILL, ADAM)(CORWILL, FRED)(TORNZBULL, BARNEY)"))
            return -1;
        return 0;
    }
    
}
