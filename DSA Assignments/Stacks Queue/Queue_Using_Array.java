public class QueueUsingArray {
    private int data[];
    private int front;
    private int rear;
    private int size;
    
    QueueUsingArray(){
        data= new int[10];
        front =-1;
        rear=-1;
        size =0;
    }
    QueueUsingArray(int capacity){
        data= new int[capacity];
        front=-1;
        rear=-1;
        size=0;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        return false;
    }
    public int front() throws QueueEmptyException{
        if(size() == 0){
            throw new QueueEmptyException();
        }
        return data[front];
        
    }
    public void enqueue(int element) throws QueueFullException{
        if(size() == data.length){
            throw new QueueFullException();
        }
        if(size == 0){
            front =0;
        }
        rear++;
        size++;
        if(rear ==data.length){
            rear=0;
        }
        data[rear]=element;
    }
    public int dequeue() throws QueueEmptyException{
        if(size() == 0){
            throw new QueueEmptyException();
        }
        int temp=data[front];
        front++;
        size--;
        if(size == 0){
            front =-1;
            rear=-1;
            
        }
        return temp;
    }
}
//Main Class 

public class Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws QueueFullException, QueueEmptyException {
        // TODO code application logic here
        QueueUsingArray queue=new QueueUsingArray();
        for(int i=1;i<=5;i++){
            queue.enqueue(i);
        }
        while(!queue.isEmpty()){
            System.out.println(queue.dequeue());
        }
        
    }
    
}

