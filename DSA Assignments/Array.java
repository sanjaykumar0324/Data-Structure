/* define void store (Array &a,int n)function to insert 1,2,3,...n(n is even)in object of array datatype using its insert function
.it will insert in such a way that first there should be odd number and then even number e.g. for n=6 ]1,3,5,2,4,6] and also count 
movements to store the numbers.
*/
public class Array {
  int a[];
   int length,size;
   public Array(int n){
       a= new int[n];
       length=n;
       size=0;
   }
      public int size(){
         
          return size;
      }
       public void insert(int x,int index)  {
          if(size == length){
              System.out.println("size full");
            
      }
      if(index<0 || index>size){
             System.out.println("Invalid index. Insertion operation failed");
           
      }
      int noOfMovements = 0;
      for(int i=size-1; i>=index; i--){
            a[i+1] = a[i];
           noOfMovements++;
      }
      a[index] = x;
      size++;
      System.out.println("\nx = "+x+", index = "+index+", no of ovements = "+noOfMovements);
       
     
          
      }
       public void display(){
           System.out.print("[");
           for(int i=0;i<size;i++){
               System.out.print(a[i]+",");
           }
           System.out.print("]");
       }
       public void store(Array a,int n)  {
           
           for(int i=1;i<=n;i++){
               if(i%2 == 1){
                   a.insert(i,(i-1)/2);
                   
               }else{
                   a.insert(i,i-1);
               }
           }
           
       }
public static void main(String[] args)  {
       Scanner sc= new Scanner (System.in);
       int n=sc.nextInt();
       Array z= new Array(3*n/2);
       z.store(z,n);
       System.out.println("Content of Array ");
      z.display();
}
}
