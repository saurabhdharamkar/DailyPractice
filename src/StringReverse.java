public class StringReverse {

    public static void main(String[] args) {

        String str="Nayan";
        int len=str.length();
        String reverse="";
        char [] ch=str.toCharArray();

        for(int i=len-1;i>=0;i--){
            reverse+=ch[i];
        }
        System.out.print("Revesre : "+reverse);

        System.out.println();
        if(str.equalsIgnoreCase(reverse)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");

        }
    }
}
