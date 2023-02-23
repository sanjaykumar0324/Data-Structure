 public static Node<Integer> midPoint(Node<Integer> head) {
	        //Your code goes here
	        if (head==null || head.next==null)
	        {
	            return head;
	        }
	        Node<Integer> fast=head,slow=head;
	        while(fast.next!=null && fast.next.next!=null)
	        {
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow;
	    }
	
