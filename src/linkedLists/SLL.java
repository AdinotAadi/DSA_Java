package linkedLists;

public class SLL {

    static class Node {
        int data;
        Node next;

        Node() {
            this.data = 0;
            this.next = null;
        }

        Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
    private static Node head;

    public void insertBegin(int val) {
        System.out.println("Inserting at the beginning.");
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertEnd(int val) {
        if(head == null) {
            System.out.println("The linked list is empty. Inserting at the beginning.");
            insertBegin(val);
            return;
        }
        System.out.println("Inserting at the end.");
        Node i = head;
        while(i.next != null) {
            i = i.next;
        }
        i.next = new Node(val);
    }

    public void dropHead() {
        if(head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        head = head.next;
    }

    public void dropVal(int val) {
        if(head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        if(head.data == val) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.data != val) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Value not found in the linked list.");
            return;
        }
        current.next = current.next.next;
    }

    public void dropTail() {
        if(head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        Node i = head;
        while(i.next.next != null) {
            i = i.next;
        }
        i.next = null;
    }

    public void search(int val) {
        int pos = 0;
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        Node i = head;
        while (i != null && i.data != val) {
            i = i.next;
            pos++;
        }
        if (i == null) {
            System.out.println("Item not found.");
            return;
        }
        System.out.println("Item found at index: " + pos + ".");
    }

    public void display() {
        if(head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        for(Node i = head; i != null; i = i.next) {
            System.out.print(i.data + " -> ");
        }
        System.out.println(" X ");
    }

    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.insertBegin(10);
        ll.insertBegin(20);
        ll.insertBegin(30);
        ll.display();
        ll.insertEnd(100);
        ll.insertEnd(200);
        ll.insertEnd(300);
        ll.display();
        ll.dropHead();
        ll.display();
        ll.dropTail();
        ll.display();
        ll.dropVal(200);
        ll.display();
        ll.search(10);
    }
}
