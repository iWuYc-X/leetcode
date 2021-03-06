package com.iwuyc.leetcode.p00001_p00100;

import org.junit.Test;

/**
 * @author iWuYc
 */
public class P002Test {

    /**
     * l1:[2,4,3]
     * <p>
     * l2:[5,6,4]
     */
    @Test
    public void test() {
        P002.Solution solution = new P002.Solution();
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = solution.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            System.out.print(" -> ");
            result = result.next;
        }
        System.out.println(result);
    }

    /**
     * l1:[5]
     * <p>
     * l2:[5]
     */
    @Test
    public void test1() {
        P002.Solution solution = new P002.Solution();
        ListNode l1 = new ListNode(5);

        ListNode l2 = new ListNode(5);

        ListNode result = solution.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            System.out.print(" -> ");
            result = result.next;
        }
        System.out.println(result);
    }

    /**
     * l1:[1,8]
     * <p>
     * l2:[0]
     */
    @Test
    public void test2() {
        P002.Solution solution = new P002.Solution();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(8);

        ListNode l2 = new ListNode(0);

        ListNode result = solution.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            System.out.print(" -> ");
            result = result.next;
        }
        System.out.println(result);
    }

    /**
     * l1:[0]
     * <p>
     * l2:[1,8]
     */
    @Test
    public void test3() {
        P002.Solution solution = new P002.Solution();

        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(8);

        ListNode result = solution.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            System.out.print(" -> ");
            result = result.next;
        }
        System.out.println(result);
    }

    /**
     * l1:[1,4,8,9]
     * <p>
     * l2:[1,8,7,0]
     */
    @Test
    public void test4() {
        P002.Solution solution = new P002.Solution();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(8);
        l1.next.next.next = new ListNode(9);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(8);
        l2.next.next = new ListNode(7);
        l2.next.next.next = new ListNode(0);

        ListNode result = solution.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            System.out.print(" -> ");
            result = result.next;
        }
        System.out.println(result);
    }
}
