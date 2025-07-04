public class CompareTwoString {

    public static void main(String[] args) {

        String str1="saurbh";

        String str2="sfha";

        char [] ch1=str1.toCharArray();
        char [] ch2=str2.toCharArray();

        for(int i=0;i<str1.length();i++){

            for(int j=0;j<str2.length();j++){

                if(ch1[i]==ch2[j]){
                    System.out.println(ch1[i]);
                }
            }
        }
    }
}
