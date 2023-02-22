import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class LTM {
  int length;
      
    
     int br[];
   

    public LTM(int n) {
        
        br=new int[n*(n+1)/2];
       
        length=n;    
    }
    public  int mapLTM(int i,int j){
         return i*(i+1)/2+j;
        
    }
     public void LTM_read(Scanner sc){
         System.out.println("enter the elements ");
        for(int i=0;i<length;i++){
            for(int j=0;j<=i;j++){
                int index=mapLTM(i,j);
                int val=sc.nextInt();
                br[index]=val;
            }
            
        }
         
    }
      public int [] add(LTM B){
           if(length != B.length){
            System.out.println("invalid");
            exit(-1);
        }
           LTM c=new LTM(length);
            for(int i=0;i<length;i++){
                for(int j=0;j<=i;j++){
                    
                    c.br[mapLTM(i,j)]=br[mapLTM(i,j)]+  B.br[mapLTM(i,j)];
                    
                }
            }
            c.print();
            
            
           
         return c.br; 
      }
     public int [] mul(LTM B){
          if(length != B.length){
            System.out.println("invalid");
            exit(-1);
        }
           LTM c=new LTM(length);
           for(int i=0;i<length;i++){
                for(int j=0;j<=i;j++){
                     c.br[mapLTM(i,j)]=0;
                     for(int k=j ;k<=i;k++){
                         c.br[mapLTM(i,j)]=c.br[mapLTM(i,j)]+br[mapLTM(i,k)]* B.br[mapLTM(k,j)];
                     }
                    
                    
                }
            }
           c.print();
           return c.br;
     }
      
 public void print(){
        System.out.print("Matrix is \n");
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
               if(i>= j){
                   System.out.print(br[mapLTM(i,j)]+"\t");
               }else{
                   System.out.print("0"+"\t");
               }
            }
            System.out.println();
           
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc= new Scanner(System.in);
      
       System.out.println("enter order of matrix  ");
        int n=sc.nextInt();
        LTM b= new LTM(n);
         LTM a= new LTM(n);
          
        b.LTM_read(sc);
        b.print();
         System.out.println("enter order of matrix");
         n=sc.nextInt();
       
         a.LTM_read(sc);
        a.print();
         System.out.println("addition ");
        b.add(a);
         System.out.println("multiplication ");
        b.mul(a);
        
        
        
    }
    
}
