import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TechInterview {
    public static List<Integer> makeEvenElementsOddReturnFromThirdToSeventh(int[] array) {
        return Arrays.stream(array)
                .map(element -> element % 2 == 0 ? element + 1 : element)
                .boxed()
                .collect(Collectors.toList())
                .subList(2, 7);
    }
}
