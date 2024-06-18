package linkedLists;

public class DLL {
    static class DLLNode {
        DLLNode prev;
        int val;
        DLLNode next;

        DLLNode() {
            this.prev = null;
            this.val = 0;
            this.next = null;
        }

        DLLNode(int num) {
            this.prev = null;
            this.val = num;
            this.next = null;
        }
    }

    private static DLLNode head = null;
    private static DLLNode tail = null;

    public void insertBegin(int val) {
        System.out.println("Inserting at the beginning.");
        DLLNode newNode = new DLLNode(val);
        if(head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        if(head == null) {
            tail = newNode;
        }
        head = newNode;
    }

    public void insertEnd(int val) {
        if (head == null) {
            insertBegin(val);
        } else {
            DLLNode newNode = new DLLNode(val);
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void dropHead() {
        if (head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
    }

    public void dropTail() {
        if (tail == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
    }

    public void display() {
        if(head == null) {
            System.out.println("The linked list is empty.");
            return;
        }
        for(DLLNode i = head; i != null; i = i.next) {
            System.out.print(i.val + " -> ");
        }
        System.out.println(" X ");
    }

    public static void main(String[] args) {
        DLL ll = new DLL();
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
    }
}
