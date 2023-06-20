package bt11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mylist {
    public static void main(String[] args) {
        String str = "Hiếu chơi game gà vãi đái";
        List<String> list = new ArrayList<String>();

        String[] words = str.split(" ");

        for (String word : words) {
            list.add(word);
        }

        List<Integer> lengths = new ArrayList<Integer>();
        for (String word : list) {
            lengths.add(word.length());
        }

        int min = Collections.min(lengths);
        String shortestWord = "";
        for (String word : list) {
            if (word.length() == min) {
                shortestWord = word;
                break;
            }
        }

        System.out.println(shortestWord);


        List<Integer> listNumber = Arrays.asList(2,4,6,4,9);

        Integer minNumber = Collections.min(listNumber);
        System.out.println(minNumber);
    }
}
