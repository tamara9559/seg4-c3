import java.util.Arrays;
import java.util.List;

public class ejerci1 {
    public static void main(String[] args) {
        List<VideoGames> lista = Arrays.asList(
                new VideoGames("clash royale",25,"estrategia",13),
                new VideoGames("mario",59,"plataformero",5),
                new VideoGames("fornite",5,"battle royale",15)
        );
        List<VideoGames> eSales = lista.stream().filter(e -> e.getSales() > 26).toList();
        eSales.forEach(p -> System.out.println(p.getName()+" fue el juego con mayor ventas con un total de:"+p.getSales()));
    }
}