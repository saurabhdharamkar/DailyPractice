import java.util.Arrays;
import java.util.List;

public class PrimeProgram {

    public static void main(String[] args) {

        List<Integer> intList= Arrays.asList(2,3,4,5,6,7,8,9,10);
        int sum=0;
        for (int num:intList){
        for(int i=2;i<=Math.sqrt(num);i++){


               if(num%i==0){

               }else{
                   sum+=num;
                   System.out.print(num+" ");
               }
           }

       }
       System.out.println("Sum Of Prime Numbers : "+sum);
    }
}
