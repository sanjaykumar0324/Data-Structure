// 1 3 5 7 9 10 8 6 4 2 
public class Linked {
    int a[];
    public class Node{
        int data,n;
        Node next;
        Node (int data){
            this.data=data;
            next=null;
        }
        Node(int data,int n){
            a=new int[n];
            
        }
    }
     
    
     public static Node reverse(Node head){
          Node curr=head;
          Node prev=null;
          Node temp;
          while(curr != null){
              temp=curr.next;
              curr.next=prev;
              prev=curr;
              curr=temp;
          }
          return prev;
         
     }
     
     public Node oddEven1(Node head){
          Node temp=head,firstOdd=null,curOdd=null,curEven=null,firstEven=null;
         while(temp != null){
             if(temp.data % 2 != 0){
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
                 curOdd.next=reverse(firstEven);
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
    
      public Node takeInput() {
        Node head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = sc.nextInt();
        }
        return head;
    }
 public  Node print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        return head;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Linked l=new Linked();
        Node head=l.takeInput();
        
        Node head1=l.oddEven1(head);
       l.print(head1);
        
    }
    
}
