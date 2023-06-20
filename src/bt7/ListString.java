package bt7;


import java.util.ArrayList;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<Integer>();

        listNumbers.add(1);
        listNumbers.add(3);
        listNumbers.add(6);
        listNumbers.add(7);
        listNumbers.add(8);
        listNumbers.add(9);

        List<Integer> newNumbers = new ArrayList<Integer>();
        for (int i = 0; i < listNumbers.size(); i++){
            if(i%2 != 0){
                newNumbers.add(listNumbers.get(i));
            }
        }
        System.out.println(newNumbers);
    }
}
