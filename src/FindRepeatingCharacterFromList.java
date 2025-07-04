import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;

public class FindRepeatingCharacterFromList {

    public static void main(String[] args) {

        List<Integer> intList=List.of(2,4,6,4,9,5,6,8,2,6,8,2,11);

        LinkedHashSet<Integer> seen=new LinkedHashSet<>();
        LinkedHashSet<Integer> result=new LinkedHashSet<>();

//        for(int num:intList){
//            if(!seen.add(num)){
//                result.add(num);
//            }
//        }
//        System.out.println(result);

      //  intList.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::print);

//       Optional<Integer> val= intList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
//       System.out.println(val.get());

       // intList.stream().distinct().filter(ele->ele%2==0).forEach(System.out::print);

       int num= intList.stream().distinct().filter(ele->{
            if(ele<=1){
                return false;
            }
            for(int i=2;i<ele;i++){
                if(ele%i==0){
                    return false;
                }
            }
            return true;
        }).mapToInt(Integer::intValue).sum();
    }
}
