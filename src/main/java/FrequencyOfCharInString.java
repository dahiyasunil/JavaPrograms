import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharInString {

    private static Map<Character, Integer> map = new HashMap<Character, Integer>();

    public static void main(String[] args) {
        charFrequency("hello how are you");
    }

    public static void charFrequency(String input) {
        char[] charArray = input.toCharArray();

        for (char entry : charArray) {
            if (entry == ' ') {//
            } else {
                if (map.containsKey(entry)) {
                    map.put(entry, map.get(entry) + 1);
                } else {
                    map.put(entry, 1);
                }
            }
        }
        System.out.println("Character with only 1 occurrence : ");
        for (Map.Entry entry : map.entrySet()) {
            Integer temp = (Integer) entry.getValue();
            if (temp > 1) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("Character with more then single occurrence : ");
        for (Map.Entry entry : map.entrySet()) {
            Integer temp = (Integer) entry.getValue();
            if (temp >= 2) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }
}
