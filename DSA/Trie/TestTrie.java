// javac DSA/Trie/TestTrie.java
// java DSA/Trie/TestTrie

// java DSA/Trie/TestTrie.java
package DSA.Trie;

public class TestTrie {
    public static void main(String[] args) {
        MyTrie trie = new MyTrie();
        String[] words = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
        for(String w: words)
            trie.insert(w);

        System.out.println(trie.search("the")); // true
        System.out.println( trie.wordBreak("theanswerbyed") ); // false
        System.out.println( trie.wordBreak("theanswerbye") ); // true
        System.out.println(trie.startsWith("th")); // true



        MyTrie t2 = new MyTrie();
        // apple - 15, ababa - 10
        System.out.println("Count: " + t2.uniqueSubstring("ababa"));
    }
}