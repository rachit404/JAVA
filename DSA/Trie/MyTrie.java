package DSA.Trie;

public class MyTrie {
    static class Node{
        Node[] children;
        boolean eow;

        // Constructor
        public Node(){
            children = new Node[26];
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node current = root;
        for(int i = 0 ; i < word.length() ; i++){
            int idx = word.charAt(i) - 'a';

            if(current.children[idx] == null)
                current.children[idx] = new Node();
            if(i == word.length()-1)
                current.children[idx].eow = true;
            current = current.children[idx];
        }
    }

    public static boolean search(String key){
        Node current = root;
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
    
    public static boolean wordBreak(String key){
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
    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        for(String w: words)
            insert(w);

        //  System.out.println(search("the")); // true
        // System.out.println( wordBreak("theanswerbyed") ); // false
        // System.out.println( wordBreak("theanswerbye") ); // true
    }
}
