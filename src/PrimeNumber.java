import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeNumber {

    public static void main(String[] args) {


        List<Integer> intList= Arrays.asList(2,3,4,5,6,7,8,9);
        int length=intList.size();

       int sum= intList.stream().filter(PrimeNumber::isPrime).mapToInt(i->i).sum();

       System.out.println("Sum : "+sum);


        }
    public static boolean isPrime(int num) {

        if(num<=1){
            return false;
    }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }
}
