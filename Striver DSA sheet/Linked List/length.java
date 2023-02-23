 public static void print(Node<Integer> head) {
   int len=0;
        while (head != null) {
           len++;
            head = head.next;
        }
       System.out.print(len);
    }
