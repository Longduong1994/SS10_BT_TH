package bt12;

public class TestMyList {
    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();

        myList.add("Hello");
        myList.add("World");
        myList.add(1, "Java");

        System.out.println("Size: " + myList.size());

        System.out.println("Elements:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("Index of 'Java': " + myList.indexOf("Java"));
        System.out.println("Index of 'Python': " + myList.indexOf("Python"));

        myList.remove(1);

        System.out.println("Size after removal: " + myList.size());

        System.out.println("Elements after removal:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        myList.clear();

        System.out.println("Size after clear: " + myList.size());
    }
}
