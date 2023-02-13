import java.util.LinkedList;

public class MyQueue {
    private LinkedList<Integer> list;
    MyQueue(){
        list = new LinkedList<Integer>();
    }
    void enqueue(int element){
        list.add(element);
    }

    int first() {
        return list.get(0);
    }

    int dequeue() {
        int element = list.get(0);
        list.remove(0);

        return element;
    }

    public String toString() {
        return list.toString();
    }
}