import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondMaxElement {

    public static void main(String[] args) {

        List<Integer> intList=List.of(15,65,25,34,45,75,18);

        Optional<Integer> result=intList.stream().distinct().sorted(Collections.reverseOrder()).skip(1).findFirst();
    System.out.println(result.get());
    }
}
