package bt8;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("Hieu ga");
        list1.add("Duy ga");
        list1.add("Hung nghien");
        list1.add("Giang toan ngu");
        list2.addAll(list1);
        System.out.println(list2);
    }
}
