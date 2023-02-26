public class StackUsingArray {
	private int data[];
	private int top;
	public StackUsingArray() {
		data= new int[10];
		top=-1;
	}
	public StackUsingArray(int capacity) {
		data=new int[capacity];
		top=-1;
	}
	private void doubleCapacity() {
		int temp[]=data;
		data=new int[2*temp.length];
		for(int i=0;i<=top;i++) {
			data[i]=temp[i];
		}
	}
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
	public int size() {
		return top+1;
	}
	public int top() throws StackEmptyException{
		if(size() == 0) {
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return data[top];
	}
public void push(int elem) throws StackFullException{
	if(size() == data.length) {
		doubleCapacity();
	}
	top++;
	data[top]=elem;
}
public int pop() throws StackEmptyException {
	if(size() == 0) {
		StackEmptyException e=new StackEmptyException();
		throw e;
	}
	int temp=data[top];
	top--;
	return temp;
}
	public static void main(String[] args) throws StackFullException{
		// TODO Auto-generated method stub
		StackUsingArray stack= new StackUsingArray(3);
		 for(int i=1;i<=50;i++){
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
