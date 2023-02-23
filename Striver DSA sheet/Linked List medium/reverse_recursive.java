 public static Node<Integer> reverseBest(Node<Integer> head){
        if(head ==  null || head.next == null){
            return head;
        }
        Node<Integer> reversedTail=head.next;
        Node<Integer> smallHead=reverseBest(head.next);
        reversedTail.next=head;
        head.next=null;
        return smallHead;
    }
