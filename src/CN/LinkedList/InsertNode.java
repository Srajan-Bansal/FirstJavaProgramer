package CN.LinkedList;

public class InsertNode implements NodeInterface {

    static void insert(Node<Integer> head, int pos, int val) {
        Node<Integer> temp = head;
        Node<Integer> node = new Node<>(val);

        if (pos == 0) {
            node.next = head;
            return;
        }

        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        NodeInterface.print(head);
    }

    public static void main(String[] args) {
        Node<Integer> head = TakeInput.takeInput();
        insert(head, 2, 10);

//        Node<Integer> head = takeInput();
//        insertLast(head, 5);
    }

    static void insertLast(Node<Integer> head, int val) {
        Node<Integer> node = new Node<>(val);
        Node<Integer> temp = head;
        if (temp == null) {
            temp.next = node;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }
//        System.out.println(temp.data);
        temp.next = node;
        NodeInterface.print(head);
    }
}
