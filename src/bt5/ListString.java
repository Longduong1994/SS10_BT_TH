package bt5;

import java.util.ArrayList;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
        String str = "Hiếu chơi game gà vãi đái";
        List<String> list = new ArrayList<String>();

        String[] words = str.split(" ");

        for (String word : words) {
            list.add(word);
        }

        String min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min.length()) {
                min = list.get(i);
            }
        }

        System.out.println(min);
    }
}
