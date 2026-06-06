class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    // Add a node to the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        newNode.prev = current;
    }

    // Add a node to the beginning of the list
    public void prepend(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }

        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    // Print the list from head to tail
    public void displayForward() {
        Node current = head;
        StringBuilder elements = new StringBuilder();
        
        while (current != null) {
            elements.append(current.data);
            if (current.next != null) {
                elements.append(" <-> ");
            }
            current = current.next;
        }
        System.out.println(elements.toString());
    }

    // --- Example Usage ---
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.append(10);
        dll.append(20);
        dll.prepend(5);

        System.out.println("Doubly Linked List:");
        dll.displayForward(); // Output: 5 <-> 10 <-> 20
    }
}