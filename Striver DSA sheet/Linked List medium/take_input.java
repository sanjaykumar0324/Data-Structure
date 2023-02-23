public static Node<Integer> takeInput() {
		Node<Integer>head=null,tail=null;
		Scanner sc= new Scanner(System.in);
		int data=sc.nextInt();
		
		while(data != -1) {
			Node<Integer> newNode=new Node<Integer>(data);
			if(head == null) {
				head= newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=tail.next;
			}
			data=sc.nextInt();
			
		}
		return head;
		
	}
