package bt13;

public class Node {

    Node next;
    private Object data;
    Node(Object data){
        this.data = data;
    }

    public Object getData() {
        return data;
    }
}
