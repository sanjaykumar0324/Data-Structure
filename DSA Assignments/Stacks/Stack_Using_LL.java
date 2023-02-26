public class StackUsingLL {
	//Node creation
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
	}
	//initialzing
	private Node head;
	private int size;
	
	//constructor
	
	StackUsingLL(){
		head=null;
		size=0;
		
	}
	//size function
	public int size() {
		return size;
	}
	//top of the stack
	public int top() throws StackEmptyException {
		if(size() == 0) {
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	//check stack Empty or not
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		return false;
	}
	
	//push add new element in stack
	public void push(int elem) {
		Node node= new Node(elem);
		node.next=head;
		head=node;
		size++;
	}
	
	//pop delete last element insert
	
	public int pop() throws StackEmptyException {
		if(size == 0){
           StackEmptyException e= new StackEmptyException();
           throw e;
        }
		int temp=head.data;
		head=head.next;
		size--;
		return temp;
	}
	
	
	

	public static void main(String[] args) throws StackEmptyException {
		// TODO Auto-generated method stub
		StackUsingLL stack= new StackUsingLL();
        for(int i=1;i<=5;i++){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            try {
                System.out.println(stack.pop());
            } catch (StackEmptyException ex) {
               ex.printStackTrace();
            }
        }
       
	}

}
