// javac DSA/Trie/MyTrie.java
// java DSA/Trie/MyTrie
package DSA.Trie;

// Learning credit: ApnaCollege
public class MyTrie {
    private static class Node{
        Node[] children;
        boolean eow;

        // Constructor
        Node(){
            children = new Node[26];
            eow = false;
        }
    }

    private final Node root;
    
    public MyTrie(){
        this.root = new Node();
    }

    public void insert(String word){
        Node current = this.root;
        for(int i = 0 ; i < word.length() ; i++){
            int idx = word.charAt(i) - 'a';

            if(current.children[idx] == null)
                current.children[idx] = new Node();
            if(i == word.length()-1)
                current.children[idx].eow = true;
            current = current.children[idx];
        }
    }

    public boolean search(String key){
        Node current = this.root;
        for(int i = 0 ; i < key.length() ; i++){
            int idx = key.charAt(i) - 'a';

            if(current.children[idx] == null)
                return false;
            if(i == key.length()-1 && current.children[idx].eow == false)
                return false;
            current = current.children[idx];
        }
        return true;
    }
    
    public boolean wordBreak(String key){
        if(key.length() == 0)
            return true;
        
        for(int i = 1 ; i <= key.length() ; i++ ){
            String firstPart = key.substring(0, i);
            String secondPart = key.substring(i);

            if(search(firstPart) && wordBreak(secondPart))
                return true;
        }

        return false;
    }
    
    public boolean startsWith(String prefix){
        Node current = this.root;

        for(int i = 0 ; i < prefix.length() ; i++){
            int idx = prefix.charAt(i) - 'a';
            if(current.children[idx] == null)
                return false;
            current = current.children[idx];
        }
        return true;
    }

    //! recursive
    private int countNodes(Node current){
        int count = 0;
        for(int i=0;i<26;i++)
            if(current.children[i] != null)
                count += countNodes(current.children[i]);
        
        // +1 for current node of recursive call
        return count+1; 
    }
    
    public int uniqueSubstring(String key){
        //TODO 1. Calculate all suffix
        //TODO 2. Create Trie for all suffix
        for(int i=0 ; i < key.length() ; i++){
            this.insert(key.substring(i));
        }
        return countNodes(this.root);
    }

    //! recursive
    private String longestWordWithAllPrefixCheck(Node current, String ans, StringBuilder temp){
        //? base case when trie is empty
        if(current == null) 
            return ""; 
        
        for(int i = 0 ; i < 26 ; i++){
            if(current.children[i] != null && current.children[i].eow == true){
                temp.append((char)(i + 'a'));
                
                if(temp.length() > ans.length())
                    ans = temp.toString();
                
                ans = longestWordWithAllPrefixCheck(current.children[i], ans, temp);
                
                //? delete for proper backtracking
                temp.deleteCharAt(temp.length()-1);
            }
        }
        return ans;
    }
    public String longestWordWithAllPrefix(){
        return longestWordWithAllPrefixCheck(this.root, new String(), new StringBuilder());
    }

}

