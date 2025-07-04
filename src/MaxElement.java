import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxElement {

    public static void main(String[] args) {

        List<Integer> intList=List.of(12,41,23,65,24,34);

//        int max=intList.getFirst();
//
//        for(int num:intList){
//            if(num>max){
//                max=num;
//            }
//        }

        int result=intList.stream().distinct().sorted(Comparator.reverseOrder()).toList().getFirst();
        System.out.println("Max Element : "+result);
    }
}
