public class StackUsingArray {

    private int data[];
    private int top;
     public  StackUsingArray() {
         data=new int[10];
         top=-1;
     }
     
     
      public boolean isEmpty(){
          if(top == -1)
              return true;
          else
              return false;
      }
      public int size(){
         
          return top+1;
      }
      public int top(){
          if(size() == 0){
              System.out.println("stack empty");
              exit(0);
              
          }
          return data[top];
      }
      public void push(int elem){
          if(size() == data.length){
              System.out.println("full");
              exit(0);
          }
          top++;
          data[top]=elem;
      }
      public int pop() {
          if(size() == 0){
              System.out.println("stack empty");
              exit(0);
              
          }
          int temp=data[top];
          top--;
          return temp;
      }

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
        String s =sc.nextLine();
        StackUsingArray stack1 = new StackUsingArray();
             
         int dotCount=0;
         float dotR=0;
         
         int countBeforeDot=0;
         int i=0;
          while(i<s.length()){
            char c= s.charAt(i);
            //check for dot
            if(c == '.'){
               dotCount++;
               i++;
               countBeforeDot=i;
               
            }
            //check another dot 
            if(dotCount > 1){
                System.out.println("dot invalid");
                exit(0);
            }
                
        
            //check character or any symbol
           if(c >= '0' && c <= '9'){
                 stack1.push(c - '0');
                
            }else if(c == '.'){
              continue;
           }else{
                 System.out.println(" character invalid");
               
               exit(0);
            }
           i++;
        }
          
          int si=stack1.size()- countBeforeDot;
          
         float ans=0;
        
       int factor = 1;
       //left of dot
       int k=0;
    while ( k <= si) {
      int digit = stack1.pop();
      ans += digit * factor;
      factor *= 10;
      k++;
    }
     factor=1;
    while ( !stack1.isEmpty()) {
        //System.out.println("pop "+stack1.pop());
       int digit = stack1.pop();
       dotR += digit * factor;
       factor *= 10;
       
     
      
    }
         double result = 1;
        
        for (int d= 0; d <= si; d++) {
            result *= 10;
        }
        

         
        
     double finalAns = ans/result+dotR;
        System.out.println(finalAns);
    }
    
}
