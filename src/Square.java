public class Square {

    public static void main(String[] args) {

        int num=2;
        int base=1;
        int square=2;

        for(int i=1;i<=square;i++){
            base*=num;
        }
        System.out.println(base);
    }
}
