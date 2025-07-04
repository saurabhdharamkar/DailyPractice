import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

    public static void main(String[] args) {

        String str="abacbd";
        int len=str.length();
        char [] ch=str.toCharArray();

        Set<Character> hs=new HashSet<>();
        for(char c:ch){
            hs.add(c);
        }
        for(char txt:hs){
            System.out.println(txt);
        }
    }
}
