
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode current = ans;
        ListNode temp = head;
        while(temp!=null)
        {
                if(temp.next!=null&&temp.val==temp.next.val)
                {
                    int value = temp.val;
                    while(temp!=null&&temp.val==value)
                    {
                        temp = temp.next;
                    }
                    
                }
                else
                {
                    current.next = temp;
                    current = temp;
                     temp = temp.next;
                }
               
        }
        current.next = null;
        return ans.next;
    }
}
