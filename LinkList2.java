public class LinkList2 {

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        first.next = second;
        second.next = third;
        third.next = fourth;

        Node previous = null;
        Node current = first;

        while (current != null) {

            Node next = current.next;

            current.next = previous;

            previous = current;

            current = next;
        }

        Node temp = previous;

        while (temp != null) {

            System.out.print(temp.data + " ");

            temp = temp.next;
        }
    }
}