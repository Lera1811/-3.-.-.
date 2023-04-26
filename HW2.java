public class Main {
    private Node head;
    private class Node{
        private int value;
        private Node next;
    }
    public void addToStart(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = new Node();
            temp = head;
            head = node;
            head.next = temp;
        }
    }
    public void find (Node node) {
        if (head == null) {}
    }
    public void delete(Node node) {
    }
}