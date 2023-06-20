package bt3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListNumber {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<Integer>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(6);
        listNumbers.add(7);
        listNumbers.add(5);

        listNumbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i : listNumbers) {
            System.out.println(i);
        }
    }
}
