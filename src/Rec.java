
import java.util.List;

public class Rec {

    public static void main(String[] args) {

        List<Integer> intList=List.of(3,4,5,6,7,8,9);
        for(int num:intList){
            if(Rec.isPrime(num)){
                System.out.print(num+" ");
            }
        }
    }

    private static boolean isPrime(int num) {
        if(num<=1){
            return  false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

}
