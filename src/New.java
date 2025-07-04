import java.util.HashMap;
import java.util.Map;

public class New {

    public static void main(String[] args) {

        String str="ggffufgiyfiifthhfttdojo";

        int length=str.length();
        char [] ch=str.toCharArray();

        Map<Character,Integer> hashMap=new HashMap<>();

        for(int i=0;i<length;i++){
            if(hashMap.containsKey(ch[i])){
                hashMap.put(ch[i],hashMap.get(ch[i])+1);
            }else{
                hashMap.put(ch[i],1);
            }
        }

        System.out.println(hashMap);
    }

}
