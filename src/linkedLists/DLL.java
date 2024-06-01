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

    public void insertBegin(int val) {
        System.out.println("Inserting at the beginning.");
        DLLNode newNode = new DLLNode(val);
        if(head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
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
    }
}
