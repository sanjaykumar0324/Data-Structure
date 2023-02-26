class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
         ListNode temp=head,firstOdd=null,curOdd=null,curEven=null,firstEven=null;
         int i=0;
         while(temp != null){
             i++;
             if(i % 2 != 0){
                 if(firstOdd == null){
                     firstOdd=curOdd=temp;
                 }else{
                     curOdd.next=temp;
                     curOdd=curOdd.next;
                     
                 }
             }else {
                  if(firstEven == null){
                     firstEven=curEven=temp;
                 }else{
                     curEven.next=temp;
                     curEven=curEven.next;
                     
                 }
             }
             temp=temp.next;
         }
         if(firstOdd != null){
             if(firstEven != null){
                 curEven.next=null;
                 curOdd.next=firstEven;
             }else{
                 curOdd.next=null;
             }
             head=firstOdd;
         }else{
             curEven.next=null;
             head=firstEven;
         }
         return head;
    }
}
