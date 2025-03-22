package ru.r1b;

import java.util.LinkedList;

public class LinkedListCycle {
    private static int VAL_LIMIT = 100000;
    public static void main(String[] args) {

        ListNode head = buildList(new int[]{-21,10,17,8,4,26,5,35,33,-7,-16,27,-12,6,29,-12,5,9,20,14,14,2,13,-24,21,23,-21,5}, -1);
        System.out.println(new LinkedListCycle().hasCycle(head));
    }

    private static ListNode buildList(int[] vals, int pos) {
        int i = 0;
        ListNode prevNode = null, firstNode = null, linkedNode = null;
        do {
            ListNode node = new ListNode(vals[i]);
            if (firstNode == null) {
                firstNode = node;
            }
            if (prevNode != null) {
                prevNode.next = node;
            }
            if (pos == i) {
                linkedNode = node;
            }
            prevNode = node;

        } while (++i < vals.length);

        if (linkedNode != null) {
            prevNode.next = linkedNode;
        }

        return firstNode;
    }

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        int limit = 10000;
        while (head.next!=null && limit>0) {
            if (head.next.val > VAL_LIMIT) {
                return true;
            }
            head.val+=2*VAL_LIMIT;
            head = head.next;
            limit--;
        };
        return false;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
