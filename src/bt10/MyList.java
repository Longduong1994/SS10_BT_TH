package bt10;

import java.util.Arrays;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(1,4,5,7,8,9);

        int sum = 0;
        for (Integer number:listNumbers) {
            sum+= number;
        }

        System.out.println(sum);
    }
}
