import java.util.Arrays;
import java.util.List;

public class EvenSum {

    public static void main(String[] args) {

        List<Integer> intList= Arrays.asList(1,2,3,4,5,6,7,8,9);
        int sum=0;
//        for(int num:intList){
//            if(num%2==0){
//                sum+=num;
//            }
//        }
//        System.out.println("Sum : "+sum);

        int total=intList.stream().filter(ele->ele%2==0).mapToInt(i->i).sum();
        System.out.println("Sum : "+total);
    }
}
