import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElements {

    private static int[] input = {4, 6, 4, 3, 8, 6, 4, 3, 3, 3};
    private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public static void main(String[] args) {
        frequency(input);
    }

    public static void frequency(int[] input) {
        for (int number : input
        ) {
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
