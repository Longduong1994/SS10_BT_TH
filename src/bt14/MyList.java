package bt14;

import java.util.ArrayList;
import java.util.Random;


public class MyList {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10) + 1; // Kích thước ngẫu nhiên từ 1 đến 10
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        // Tạo ma trận và thêm phần tử ngẫu nhiên
        for (int i = 0; i < size; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                int element = random.nextInt(101); // Giá trị ngẫu nhiên từ 0 đến 100
                row.add(element);
            }
            matrix.add(row);
        }

        // In ma trận
        System.out.println("Ma trận vuông:");
        for (ArrayList<Integer> row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
