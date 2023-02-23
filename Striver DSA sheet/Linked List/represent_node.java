public class Node<T> {
	T data;
	Node<T> next;
	Node(T data){
		this.data=data;
		next= null;
	}
  //where T is generic
