import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ejer1 {
    public static void main(String[] args) {
        List<Carro> car = Arrays.asList(new Carro("bugatti", "negro", "ABC123"), new Carro("Ford", "gris", "DEF456"));
        List<String> names = car.stream()
                .map(person -> person.getName().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(names);
}}
