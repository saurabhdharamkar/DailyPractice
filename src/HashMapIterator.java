import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {

    public static void main(String[] args) {

        Map<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"Saurabh");
        hashMap.put(2,"Raj");
        hashMap.put(3,"Ganesh");
        hashMap.put(4,"Raju");
        hashMap.put(5,"iop");

        hashMap.entrySet().stream().filter(ele->ele.getKey()%2==0).forEach(ele->ele.getKey());
    }
}
