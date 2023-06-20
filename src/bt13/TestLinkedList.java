package bt13;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList<String> linkedList = new MyLinkedList<>();

        // Thêm phần tử vào danh sách
        linkedList.add("Element 1");
        linkedList.add("Element 2");
        linkedList.add("Element 3");
        linkedList.addFirst("First Element");
        linkedList.addLast("Last Element");

        // In danh sách
        System.out.println("Danh sách ban đầu:");
        linkedList.printList();
        System.out.println("Số phần tử trong danh sách: " + linkedList.size());

        // Kiểm tra và truy cập phần tử
        System.out.println("Phần tử đầu tiên trong danh sách: " + linkedList.getFirst());
        System.out.println("Phần tử cuối cùng trong danh sách: " + linkedList.getLast());
        System.out.println("Phần tử tại vị trí 2 trong danh sách: " + linkedList.get(2));

        // Xóa phần tử khỏi danh sách
        linkedList.remove(1);
        System.out.println("Danh sách sau khi xóa phần tử tại vị trí 1:");
        linkedList.printList();

        linkedList.remove("Element 3");
        System.out.println("Danh sách sau khi xóa phần tử 'Element 3':");
        linkedList.printList();

        // Sao chép danh sách
        MyLinkedList<String> clonedList = linkedList.clone();
        System.out.println("Danh sách đã sao chép:");
        clonedList.printList();

        // Kiểm tra sự tồn tại của phần tử và vị trí của phần tử
        System.out.println("Có chứa phần tử 'First Element'? " + linkedList.contains("First Element"));
        System.out.println("Vị trí của phần tử 'Last Element': " + linkedList.indexOf("Last Element"));

        // Xóa tất cả phần tử trong danh sách
        linkedList.clear();
        System.out.println("Danh sách sau khi xóa tất cả phần tử:");
        linkedList.printList();
        System.out.println("Số phần tử trong danh sách: " + linkedList.size());
    }
}
