public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hashTable= new HashSet<>();
        while(head != null){
            if(hashTable.contains(head)){
                  return head;
            }
           
            hashTable.add(head);
            head= head.next;
        }
        return null;
    }
}
