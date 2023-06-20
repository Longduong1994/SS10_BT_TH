package bt1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class bt1 {
    public static void main(String[] args) {
        // Tạo một list số nguyên ngẫu nhiên
        List<Integer> list = createRandomList();

        // In ra list số nguyên
        System.out.println("List số nguyên ngẫu nhiên:");
        printList(list);

        // Tìm phần tử lớn nhất trong list
        int max = Collections.max(list);

        // In phần tử lớn nhất
        System.out.println("Phần tử lớn nhất trong list: " + max);
    }

    private static List<Integer> createRandomList() {
        List<Integer> list = new ArrayList<>();

        // Số lượng phần tử ngẫu nhiên từ 1 đến 10
        int size = (int) (Math.random() * 10) + 1;

        // Gán giá trị ngẫu nhiên cho từng phần tử
        for (int i = 0; i < size; i++) {
            int randomNum = (int) (Math.random() * 100); // Số nguyên ngẫu nhiên từ 0 đến 99
            list.add(randomNum);
        }

        return list;
    }

    private static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
