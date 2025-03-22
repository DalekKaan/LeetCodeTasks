package ru.r1b.solution.task21;


public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode outHead, outPointer = new ListNode(-1);
        outHead = outPointer;

        do {
            if (list1 == null || (list2 != null && list2.val < list1.val)) {
                // append list2 el
                outPointer.next = list2;
                outPointer = outPointer.next;
                list2 = list2.next;
            } else if (list2 == null || (list1 != null && list1.val < list2.val)) {
                // append list1 el
                outPointer.next = list1;
                outPointer = outPointer.next;
                list1 = list1.next;
            } else {
                // append both
                outPointer.next = list1;
                outPointer = outPointer.next;
                list1 = list1.next;

                outPointer.next = list2;
                outPointer = outPointer.next;
                list2 = list2.next;
            }
        } while (list1 != null || list2 != null);

        return outHead.next;
    }
}
