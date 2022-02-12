import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args){

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Geeks");
        map.put(2, "For");
        map.put(3, "Geeks");

        System.out.println(map);
    }
}
