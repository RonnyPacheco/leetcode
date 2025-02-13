package FastAndSlowPointer;

import java.util.Arrays;

public class F02LinkedListCycle {
    public static void main(String[] args) {
        LinkedList newNode = new LinkedList<>();
        int b[] = {1,2,3,4,5,6,7,8,9,10};
        newNode.createLinkedList(b);

        System.out.println(middleNode(newNode.head));




    }

    public static int middleNode(LinkedListNode head){
        LinkedListNode slow = head;
        LinkedListNode fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.data;
    }

    public static boolean detectCycle(LinkedListNode head) {
        LinkedListNode fast = head;
        LinkedListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}

class LinkedList<T> {
    public LinkedListNode head;

    public LinkedList() {
        this.head = null;
    }

    public void insertNodeAtHead(LinkedListNode node) {
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    public void createLinkedList(int[] lst) {
        for (int i = lst.length - 1; i >= 0; i--) {
            LinkedListNode newNode = new LinkedListNode(lst[i]);
            insertNodeAtHead(newNode);
        }
    }

    public static LinkedListNode getNode(LinkedListNode head, int pos) {
        LinkedListNode ptr = head;
        if (pos != -1) {
            int p = 0;

            while (p < pos) {
                ptr = ptr.next;
                p += 1;
            }

            return ptr;
        }
        return ptr;
    }

    public static int getLength(LinkedListNode head) {
        LinkedListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

class LinkedListNode {
    public int data;
    public LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}
