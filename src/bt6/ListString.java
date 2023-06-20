package bt6;
import java.util.ArrayList;
import java.util.List;

public class ListString {
    public static void main(String[] args) {
        // Tạo List chứa các số nguyên
        List<Integer> numberList = new ArrayList<>();

        // Thêm phần tử vào List
        numberList.add(5);
        numberList.add(2);
        numberList.add(8);
        numberList.add(1);
        numberList.add(9);

        // Sắp xếp danh sách theo thứ tự tăng dần bằng thuật toán nổi bọt
        bubbleSort(numberList);

        // In ra danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp tăng dần (sử dụng thuật toán nổi bọt):");
        for (int num : numberList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Tạo List mới
        List<Integer> numberList2 = new ArrayList<>();
        numberList2.add(5);
        numberList2.add(2);
        numberList2.add(8);
        numberList2.add(1);
        numberList2.add(9);

        // Sắp xếp danh sách theo thứ tự tăng dần bằng thuật toán chọn
        selectionSort(numberList2);

        // In ra danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp tăng dần (sử dụng thuật toán chọn):");
        for (int num : numberList2) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Tạo List mới
        List<Integer> numberList3 = new ArrayList<>();
        numberList3.add(5);
        numberList3.add(2);
        numberList3.add(8);
        numberList3.add(1);
        numberList3.add(9);

        // Sắp xếp danh sách theo thứ tự tăng dần bằng thuật toán chèn
        insertionSort(numberList3);

        // In ra danh sách sau khi sắp xếp
        System.out.println("Danh sách sau khi sắp xếp tăng dần (sử dụng thuật toán chèn):");
        for (int num : numberList3) {
            System.out.print(num + " ");
        }
    }

    private static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Hoán đổi các phần tử
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    private static void selectionSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list.get(j) < list.get(minIndex)) {
                    minIndex = j;
                }
            }
            // Hoán đổi các phần tử
            int temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }}
    private static void insertionSort(List<Integer> list) {
        int n = list.size();
        for (int i = 1; i < n; i++) {
            int key = list.get(i);
            int j = i - 1;
            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j--;
            }
            list.set(j + 1, key);
        }
    }
}
