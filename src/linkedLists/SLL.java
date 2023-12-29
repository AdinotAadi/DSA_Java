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

    public Node insertBegin(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return head;
        }
        newNode.next = head;
        head = newNode;
        return head;
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
    }
}
