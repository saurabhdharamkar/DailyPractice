public class NumberReverse {

    public static void main(String[] args) {

        int num=121;

        String str=Integer.toString(num);
        char [] ch=str.toCharArray();
        String reverse="";

        int length=str.length();

        for(int i=length-1;i>=0;i--){
            reverse+=ch[i];
        }
        System.out.println(reverse);
        if(str.equals(reverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Plaindrome");
        }
    }
}
