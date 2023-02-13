import java.io.IOException;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
    }

    /*
    Пусть дан LinkedList с несколькими элементами.
    Реализуйте метод, который вернет “перевернутый” список.
     */
    public static void ex1() {
        LinkedList<Integer> list = new LinkedList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println("Исходный список:");
        System.out.println(list);

        LinkedList<Integer> reversedList = reverse(list);

        System.out.println("Перевернутый список:");
        System.out.println(reversedList);

        System.out.println("Сумма элементов:");
        System.out.println(sum(list));

    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            Integer temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }

        return list;
    }

    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
     */
    public static void ex2() {
        MyQueue queue = new MyQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println("Первый элемент: " + queue.first());
        System.out.println("Удаляем первый элемент: " + queue.dequeue());
        System.out.println("Первый элемент: " + queue.first());
        System.out.println("Удаляем первый элемент: " + queue.dequeue());
        System.out.println("Первый элемент: " + queue.first());
        System.out.println("Удаляем первый элемент: " + queue.dequeue());
        System.out.println("Первый элемент: " + queue.first());
    }

    /*
    Найдите сумму всех элементов LinkedList,
    сохраняя все элементы в списке.
    Используйте итератор
     */
    public static int sum(LinkedList<Integer> list) {
        int s = 0;
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            iterator.remove();
            s += value;
        }

        return s;
    }
}