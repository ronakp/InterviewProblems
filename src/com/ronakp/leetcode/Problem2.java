package com.ronakp.leetcode;

import com.ronakp.leetcode.helper.ListNode;

class Problem2 {
    /**
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
    Example:

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.
    */
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public static void main(String[] args) {

    }

    public static ListNode Solution1(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(5);

        int firstNum = 0;
        int i = 0;
        while(l1 != null)
        {
            firstNum = firstNum + (int) (l1.val * Math.pow(10, i));
            i++;
            l1 = l1.next;
        }
        int secondNum = 0;
        int j = 0;
        while(l2 != null)
        {
            secondNum = secondNum + (int) (l2.val * Math.pow(10, j));
            j++;
            l2 = l2.next;
        }

        int midAnswer = firstNum + secondNum;
        System.out.println(midAnswer);
        
        return answer;
    }

}
