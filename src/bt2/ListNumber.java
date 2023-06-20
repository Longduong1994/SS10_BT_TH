package bt2;

import java.util.ArrayList;
import java.util.List;

public class ListNumber {
    public static void main(String[] args) {
        // Tạo một danh sách
        List<Integer> listNumber = new ArrayList<>();
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);
        listNumber.add(4);

        // Thêm một phần tử vào danh sách
        int newElement = 6;
        listNumber.add(newElement);

        // Tạo danh sách mới và thêm từng phần tử của danh sách gốc vào danh sách mới
        List<Integer> newList = new ArrayList<>();
        for (int i = listNumber.size() - 1; i >= 0; i--) {
            newList.add(listNumber.get(i));
        }

        // In danh sách mới
        for (int i : newList) {
            System.out.println(i);
        }
    }
}
