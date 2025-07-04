import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharCount1 {

    public static void main(String[] args) {

        String str="ssdfddrrsettsett";

        int length=str.length();
        Map<Character,Integer> hashMap=new HashMap<>();

        for(char ch:str.toCharArray()){
            if(hashMap.containsKey(ch)){
                hashMap.put(ch,hashMap.get(ch)+1);
            }else{
                hashMap.put(ch,1);
            }
        }

        for(Map.Entry<Character,Integer> map:hashMap.entrySet()){
            System.out.print(map);
        }
    }
}
