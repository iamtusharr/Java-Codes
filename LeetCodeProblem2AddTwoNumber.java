// Add Two Number Solution in Java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode Head = null;
        ListNode Temp = null;
        int Carry  = 0;
        while(l1 != null || l2 != null)
        {
            int Sum = 0;
            if(l1 != null)
            {
                Sum = Sum + l1.val;
                l1 = l1.next;
            }
            if(l2 != null)
            {
                Sum = Sum + l2.val;
                l2 = l2.next;
            }
            Sum = Sum + Carry;
            Carry = Sum / 10;
            ListNode NewNode = new ListNode(Sum % 10);
            if(Temp == null)
            {
                Head = Temp = NewNode;
            }
            else
            {
                Temp.next = NewNode;
                Temp = Temp.next;
            }
        }
        if(Carry > 0)
        {
            Temp.next = new ListNode(Carry);            
        }
        return Head;
        
    }
}
