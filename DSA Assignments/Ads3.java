/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads2;

import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Ads2 {
int a[];
   int length,size;
   public Ads2(int n){
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
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        Ads2 a= new Ads2(n);
        for(int i=0;i<n;i++){
            a.insert(i+1, i);
        }
        System.out.println(a.size());
        a.display();
        
        System.out.println("Enter the index you want to delete ");
        int index=s.nextInt();
        a.del(index);
        
        
        
    }
    
}
