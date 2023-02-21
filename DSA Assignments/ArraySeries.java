/* write void store (Array &a,int n) to store series 1,2,2,3,4,4,5,6,6...n,n for even n using insert method
i)void delDuplicateMinMovements(Array &a,int n)to remove duplicate number using minimum movements
ii)delDuplicateMaxMovement(Array &a,int n)
*/
public class ArrayPractice {
    
   int a[];
   int length,size;
   public ArrayPractice(int n){
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
   
      for(int i=size-1; i>=index; i--){
            a[i+1] = a[i];
            
      }
      a[index] = x;
      size++;
    
      }
       public void display(){
           System.out.print("[");
           for(int i=0;i<size;i++){
               System.out.print(a[i]+",");
           }
           System.out.print("]");
       }
       public void store(ArrayPractice a,int n)  {
           
           for(int i=1;i<=n;i++){
               if(i%2 == 1){
                   a.insert(i,(i-1)/2);
                   
               }else{
                   a.insert(i,i-1);
               }
           }
           
       }

       public void store2(ArrayPractice a,int n){
           
             for(int i=1;i<=n;i++){
               if(i%2 == 1){
                   a.insert(i,a.size());
                    
                   
               }else{
                   a.insert(i,a.size());
                   a.insert(i,a.size());
                  

               }
           }
       }
       public int del(int index){
           if(size == 0){
               System.out.println("Array is empty ");
               exit(0);
           }
           if(index<0 || index>size){
             //  System.out.println("invalid index ");
               exit(0);
           }
           int x=a[index];
           int noOfMovements=0;
           for(int i=index+1;i<size;i++){
               a[i-1]=a[i];
               noOfMovements++;  
           }
           System.out.println("\n deleted element = "+x+" ,index = " +index+" no of movements "+noOfMovements);
           size--;
           return x;
       }
       public void delDuplicateMinMovement(ArrayPractice a,int n){
           int m=3*n/2-1;
           for(int i=m;i>=2;i=i-3){
               a.del(i);
           }
       }
       public void delDuplicateMaxMovement(ArrayPractice a,int n){
            int m=3*n/2-1;
           for(int i=1;i<m;i=i+2){
               a.del(i);
           }
       }
       
    
        
      

   
    public static void main(String[] args)  {
       Scanner sc= new Scanner (System.in);
       int n=sc.nextInt();
   
    ArrayPractice z= new ArrayPractice(3*n/2);
        z.store2(z,n);
        System.out.println("Content of Array ");
       z.display();
  
        z.delDuplicateMaxMovement(z, n);
       
        
    }
    
}
