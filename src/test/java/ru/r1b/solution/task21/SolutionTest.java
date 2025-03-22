package ru.r1b.solution.task21;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void mergeTwoLists() {
        ListNode actual = new Solution().mergeTwoLists(
                buildList(new int[]{2}),
                buildList(new int[]{1})
        );
        ListNode expected = buildList(new int[]{1,2});
        assertEquals(list2str(actual), list2str(expected));

    }

    private static ListNode buildList(int[] vals) {
        int i = 0;
        ListNode prevNode = null, firstNode = null;
        do {
            ListNode node = new ListNode(vals[i]);
            if (firstNode == null) {
                firstNode = node;
            }
            if (prevNode != null) {
                prevNode.next = node;
            }
            prevNode = node;

        } while (++i < vals.length);

        return firstNode;
    }

    private static String list2str(ListNode head) {
        StringBuilder out = new StringBuilder();
        do {
            out.append(head.val);
            out.append(", ");
        } while ((head = head.next) != null);
        return out.toString();
    }
}