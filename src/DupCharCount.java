import java.util.HashMap;

public class DupCharCount {

    public static void main(String[] args) {

        String str="gfhdgfhdgfthdgd";

        char [] ch=str.toCharArray();
        int len=str.length();
        HashMap<Character,Integer> mapList=new HashMap<>();
        for(int i=0;i<len;i++){

            if(mapList.containsKey(ch[i])){
                mapList.put(ch[i],mapList.get(ch[i])+1);
            }else{
                mapList.put(ch[i],1);
            }

        }

        for(char key:ch){
            System.out.print(key+""+mapList.get(key));
        }




    }
}
