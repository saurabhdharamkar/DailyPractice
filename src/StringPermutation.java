public class StringPermutation {

    public static void main(String[] args) {

        String str="XYZ";
        int len=str.length();
        char [] ch =str.toCharArray();

        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(ch[i]!=ch[j]){
                    System.out.println(ch[i]+""+ch[j]);
                }
            }
        }
    }
}
