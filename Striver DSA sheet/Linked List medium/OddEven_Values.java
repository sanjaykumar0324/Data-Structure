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
                 curOdd.next=firstEven;
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
     public Node posNeg(Node head){
         Node temp=head,firstNeg=null,curNeg=null,curPos=null,firstPos=null;
         while(temp != null){
             if(temp.data < 0){
                 if(firstNeg == null){
                     firstNeg=curNeg=temp;
                 }else{
                     curNeg.next=temp;
                     curNeg=curNeg.next;
                     
                 }
             }else if(temp.data > 0){
                  if(firstPos == null){
                     firstPos=curPos=temp;
                 }else{
                     curPos.next=temp;
                     curPos=curPos.next;
                     
                 }
             }
             temp=temp.next;
         }
         if(firstNeg != null){
             if(firstPos != null){
                 curPos.next=null;
                 curNeg.next=firstPos;
             }else{
                 curNeg.next=null;
             }
             head=firstNeg;
         }else{
             curPos.next=null;
             head=firstPos;
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
