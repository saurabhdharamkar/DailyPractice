import java.util.List;
import java.util.stream.Collectors;

public class FebonossiSeries {

    public static void main(String[] args) {

        List<Integer> intList=List.of(5,4,9,7,5);
        List<Integer> resultList=null;

        resultList=intList.stream().filter(ele->ele<7).map(ele->ele+2).toList();
        resultList.forEach(System.out::println);

        for(int num:intList){
            if(num<7){
                num=num+2;
                System.out.println(num);
            }
        }
    }
}
