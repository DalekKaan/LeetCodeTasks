package ru.r1b.solution.task141;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void hasCycle() {
        Solution solution = new Solution();
        assertTrue(solution.hasCycle(buildList(new int[]{3, 2, 0, -4}, 1)));
        assertTrue(solution.hasCycle(buildList(new int[]{2,1}, 0)));
        assertFalse(solution.hasCycle(buildList(new int[]{1}, -1)));
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
}