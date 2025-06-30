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

        MyTrie t3 = new MyTrie();
        String[] words2 = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for(String w: words2)
            t3.insert(w);
        /*
         * prefix of apple: a, ap, app, appl, apple
         * prefix of apply: a, ap, app, appl, apply
         * If "apple" doesnt exist in above array, "apply" would be answer for below sout
         */
        System.out.println("Longest: "+t3.longestWordWithAllPrefix()+";");
    }
}