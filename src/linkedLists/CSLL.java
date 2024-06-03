package linkedLists;

public class CSLL {
    class CSNode {
        int val;
        CSNode next;

        CSNode() {
            this.val = 0;
            this.next = null;
        }

        CSNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    private CSNode head = null;
    private CSNode tail = null;

    public void insertBegin(int val) {
        CSNode newNode = new CSNode(val);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {

        }
    }
}
