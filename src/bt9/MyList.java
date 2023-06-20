package bt9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1,3,5,6,2,3,5);

        List<Integer> numbers = new ArrayList<Integer>();

        System.out.println(listNumbers.contains(3));
        for (Integer number: listNumbers) {
            if (!numbers.contains(number)){
                numbers.add(number);
            }
        }
        System.out.println(numbers);
    }
}
