public class J25Q {
    public static void main(String args[]){
        QueueList<Integer> list;
        list = new QueueList<Integer>();

        list.enqueue(1);
        list.enqueue(2);
        list.enqueue(3);

        list.dequeue();
        list.dequeue();
        list.dequeue();
    }

}