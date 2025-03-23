package ru.r1b.solution.task141;

/**
 * 141. Linked List Cycle
 */
public class Solution {
    private static int VAL_LIMIT = 100000;

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        int limit = 10000;
        while (head.next != null && limit > 0) {
            if (head.next.val > VAL_LIMIT) {
                return true;
            }
            head.val += 2 * VAL_LIMIT;
            head = head.next;
            limit--;
        }
        ;
        return false;
    }
}
