/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ltm_utm;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class LTM_UTM {
     int length;
      
    
     int br[][];
   

    public LTM_UTM(int n) {
        
        br=new int[n][n];
       
        length=n;    
    }
 public void LUTM_read(Scanner sc,int n){
         System.out.println("enter the elements ");
        for (int i = 0; i <n ;i++) {
      for (int j = 0; j < n-i; j++) {
              br[i][j]=sc.nextInt();
            }
           
        }
         
    }
  public void LUTM_print(){
        
        for (int i = 0; i <length ;i++) {
      for (int j = 0; j <length; j++) {
          System.out.print(br[i][j]+" ");
      }
            System.out.println();
        }
         
    }
  public int [][] mul(LTM_UTM B){
           if(length != B.length){
            System.out.println("invalid");
            exit(-1);
        }
           LTM_UTM c=new LTM_UTM(length);
            for(int i=0;i<length;i++){
                for(int j=0;j<length;j++){
                    
                    c.br[i][j]=0;
                    for(int k=0; k<=((length-1) - Math.max(i,j));k++){
                         
                          c.br[i][j]=c.br[i][j]+br[i][k]* B.br[k][j];
                    }
                }
            }
            c.LUTM_print();
            
            
           
         return c.br; 
      }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println("Enter matrix A");
        LTM_UTM a= new LTM_UTM(n);
       
        a.LUTM_read(sc,n);
        a.LUTM_print();
        
         System.out.println("Enter matrix B");
         n=sc.nextInt();
         LTM_UTM b= new LTM_UTM(n);
       
        b.LUTM_read(sc,n);
        b.LUTM_print();
         System.out.println("Multiplication ");
        a.mul(b);
        
        
    }
    
}







//
//  for(int k=0; k<((n-1) - Math.max(i,j));k++){
//                   
//               } 
