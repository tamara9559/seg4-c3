import java.util.Arrays;
import java.util.List;

public class ejercisio {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 55, 343, 52, 2354, 856, 255, 12);

        List<Integer> organizeNumbers = numbers.stream()
                .filter(n -> n > 100)
                .sorted()
                .toList();
        System.out.println(organizeNumbers);
    }
}