import java.util.*;
class Trie{
    Trie c[] = new Trie[26];
    int count;
    Trie(){
        this.count=0;
        for(int i=0; i<26; i++){
            this.c[i] = null;
        }
    }
}
public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Trie root = new Trie();
        for(int i=0; i<=t; i++){
            String q[] = sc.nextLine().split(" ");
            if(q[0].equalsIgnoreCase("add"))
                insert(root,q[1]);
            else if(q[0].equalsIgnoreCase("find")){
                int count = count(root, q[1]);
                System.out.println(count);
            }
        }
    }
    public static void insert(Trie root , String word){
        int len = word.length();
        for(int i=0; i<len; i++){
            int idx = word.charAt(i) - 'a';
            if(root.c[idx] == null)
                root.c[idx] = new Trie();
            root = root.c[idx];
            root.count++;
        }
    }
    public static int count(Trie root,String word){
        int len = word.length();
        for(int i=0; i<len; i++){
            int idx = word.charAt(i) - 'a';
            if(root.c[idx] == null){
                return 0;
            }
            root = root.c[idx];
        }
        return root.count;
    }
}