public class CountTotalChar {

    public static void main(String[] args) {

        String str="Saurabh";
        int len=str.length();
        int count=0;

        for(int i=0;i<len;i++){
            ++count;
        }
        System.out.println("Count "+count);
    }
}
