import java.util.LinkedList;

public class QueueList<T> {

    LinkedList<T> list;

    QueueList() {
        list = new LinkedList<T>();
    }

    public int enqueue(T youso) {
        list.addLast(youso);
        System.out.println("追加した要素:" + youso);
        return list.size();
    }

    public T dequeue() {
        E ret = list.getFirst();

        System.out.println("取り出した要素:" + ret);
        list.removeFirst();
        return ret;
    }

}