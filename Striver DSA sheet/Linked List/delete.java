public static Node<Integer> removeElement(Node<Integer> head,int val){
		if(head == null ) {
			return head;
			
		}
		Node<Integer> temp=head;
		while(temp != null && temp.data == val) {
			temp=temp.next;
		}
		while(temp != null) {
			if(temp.data == val) {
				temp=temp.next;	
			}
			else {
				temp=temp.next;
			}
		}
		return head;
		
	}
	
