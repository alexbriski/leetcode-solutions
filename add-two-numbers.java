/**
 * https://leetcode.com/problems/add-two-numbers/
 * You are given two non-empty linked lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 *
 * 
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {        
        BigInteger number1 = new BigInteger(this.readListNode(l1));
        BigInteger number2 = new BigInteger(this.readListNode(l2));
        BigInteger sum = number1.add(number2);
        StringBuilder result = new StringBuilder();
        result.append(sum.toString());
        String resultStr = result.reverse().toString();
        ListNode ret = new ListNode(Character.getNumericValue(resultStr.charAt(0)));
        ListNode[] listNodes = new ListNode[resultStr.length()];
        for (int i = 0; i < resultStr.length(); i++) {
            listNodes[i] = new ListNode(Character.getNumericValue(resultStr.charAt(i)));
        }
        for (int i = 0; i < resultStr.length(); i++) {
            if (i + 1 < resultStr.length()) {
                listNodes[i].next = listNodes[i+1];
            }
        }
        return listNodes[0];
    }
    
    private String readListNode(ListNode l) {
        StringBuilder number1 = new StringBuilder();
        number1.append(Integer.toString(l.val));
        while (l.next != null) {
            number1.append(Integer.toString(l.next.val));
            l = l.next;
        }
        if (number1.length() <= 0) {
            return "0";
        };
        number1 = number1.reverse();
        System.out.println(number1);
        return number1.toString() == "" ? "0" : number1.toString();
    }
}
