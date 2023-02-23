public static Node<Integer> removeDuplicates(Node<Integer> head) {
		//Your code goes here
			Node<Integer>current= head,index=null;
			Node<Integer>temp=null;
			if(head == null ) {
				return head;
			}

			
		
		while(current != null){
			temp=current;
			index=current.next;
			
	
	while(index != null) {
		if(current.data == index.data) {
			temp.next=index.next;
		}else {
			temp=index;
		}
		index=index.next;
	}
	current = current.next;

		}
		return head;

	}
