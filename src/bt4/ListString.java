package bt4;

import java.util.ArrayList;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
         String str = "Rikkei Academy de nong dan biet code";
        List<String> list = new ArrayList<>();

        String[] words = str.split(" ");
        for (String word : words) {
            list.add(word);
        }

        for (String word : list) {
            if (word.length() > 3){
                System.out.println(word);
            }
        }

    }
}
