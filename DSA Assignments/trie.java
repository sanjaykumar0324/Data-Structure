import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode('\0');
    }
    private void add(TrieNode root, String word){
        if(word.length() == 0){
            root.isEndOfWord = true;
            root.frequency++;
            return;
        }
         int childIndex = word.charAt(0) - 'A';
            if (word.charAt(0) >= 'a') 
                childIndex = word.charAt(0) - 'a' + 26;
            
            TrieNode child = root.children[childIndex];
            if(child == null){
                child = new TrieNode(word.charAt(0));
                root.children[childIndex]= child;
            }
            add(child,word.substring(1));
            root.frequency++;
           
            
    }
    public void add(String word){
        add(root,word);   
    }
    
    private boolean search(TrieNode root,String word){
        if(word.length() == 0)
            return root.isEndOfWord;
        int childIndex = word.charAt(0) - 'A';
            if (word.charAt(0) >= 'a') 
                childIndex = word.charAt(0) - 'a' + 26;
            
            TrieNode child = root.children[childIndex];
            if(child == null){
               return false;
            }
            return search(child,word.substring(1));
        
    }
    public boolean search(String word){
        return search(root,word);
    }
    
    
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        // TODO code application logic here
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
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
       s = reader.readLine();
        reader.close();
        
        }catch(IOException e){
            e.printStackTrace();
        }
         System.out.println(s);
          String[] words = s.split("\\s+");
                for (String word : words) {
                    trie.add(word);
                }
                System.out.println(trie.search("hi"));
    }
    
    // creating node
      class TrieNode{
        char data;
        TrieNode[]children;
        boolean isEndOfWord;
        int frequency;
        
        public TrieNode(char data){
            this.data=data;
            children = new TrieNode[52];
            isEndOfWord = false;
            frequency =0;
            
        }

        
    }
    
}





//        public boolean isLeaf(){
//            for(TrieNode child:children){
//                if(child != null){
//                    return false;
//                }
//                
//            }
//            return true;
//            
//        }
