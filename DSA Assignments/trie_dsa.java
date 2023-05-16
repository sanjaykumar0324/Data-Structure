
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class JavaApplication52 {
     static int height =0;
    static int numberOfWords=0;
    
    static class Trie{
        public class TrieNode{
        
        TrieNode[]children;
        int frequency;
        
        public TrieNode(){
            
            children = new TrieNode[52];
              frequency =0; 
        } 
    }
        
         private TrieNode root;
         Trie(){
        root = new TrieNode();
    }
          private  int getIndex(char c) {
             if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        } else if (c >= 'a' && c <= 'z') {
            return c - 'a'+ 26;
        }  else {
            throw new IllegalArgumentException("Invalid character: " + c);
        }
    }
    public  void add(String word){
        TrieNode node=root;
      
        for(int i=0;i<word.length();i++){
            char  c = word.charAt(i);
            int childIndex = getIndex(c);
         
            if(node.children[childIndex] == null){
                node.children[childIndex] = new TrieNode();
                
            }
            node = node.children[childIndex];
            
        }
        node.frequency++;
    }
   
    
    public boolean search(String word){
        
       TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char  c = word.charAt(i);
            int childIndex = getIndex(c);
            if(node.children[childIndex] == null){
                return false;
            }
            node=node.children[childIndex];
        }
        return true;
        
    }
public int getFrequency(String word) {
       TrieNode node=root;
        for(int i=0;i<word.length();i++){
            char  c = word.charAt(i);
            int childIndex = getIndex(c);
      
            if(node.children[childIndex] == null){
                return 0;
                
            }
            node=node.children[childIndex];
            
        }
        return node.frequency;
    }
    }

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
         String s="";
           Trie trie = new Trie();
         
//        try{
//        BufferedWriter writer  = new BufferedWriter(new FileWriter("input.txt"));
//        writer.write("hi this is sanjay");
//        writer.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
         try{
        BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
        s = reader.readLine();
        reader.close();
        
        }catch(IOException e){
            e.printStackTrace();
        }
         System.out.println("String you have entered : "+s);
         System.out.println("\n");
        
          String[] words = s.split("\\s+");
                for (String word : words) {
                     trie.add(word);
                     numberOfWords++;
                   
                    if(height == 0) {
                      height = word.length();
                    }else{
                      if(height < word.length())
                          height = word.length();
                    
                    }
                }
              
                System.out.println("Total Number of Words Inserted : "+numberOfWords); 
                System.out.print("Enter the Word To Search : ");
                String ws = sc.nextLine();
               System.out.println("Searched word : "+ws+"  "+trie.search(ws) +" | frequency of "+ws+ " is "+trie.getFrequency (ws)); 
               
                System.out.println("Height of Trie : "+height);
    }
    
}
