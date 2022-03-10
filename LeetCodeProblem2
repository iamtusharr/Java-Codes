// Add Two Number Solution in Java
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode NewNode = new ListNode();
        ListNode Temp = NewNode;
        int Carry  = 0;
        while(l1 != null || l2 != null || Carry == 1 )
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
            ListNode NewNode2 = new ListNode(Sum % 10);
            Temp.next = NewNode2;
            Temp = Temp.next;
        }
        return NewNode.next;
        
    }
}
