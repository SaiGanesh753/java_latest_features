package java_8_exmp.steamAPI;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountChars {
    public static void main(String[] args) {
        // "i am sai ganesh, senior java developer
        String str = "i am sai ganesh Senior java developer";
        Map<String, Long> map = new HashMap<>();
        for (int i = 0; i<str.length(); i++) {
            String ch = String.valueOf(str.charAt(i)).toLowerCase();
            if (ch.equals(" ")) {
                continue;
            }
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1l);
            }
        }
        System.out.println("map1 : "+map);

        //Java8
        String str2 = "i am sai ganesh Senior java developer";
        Map<String, Long> map2 = str2.chars()
                .filter(ch -> (char) ch != ' ')
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(ch -> String.valueOf(ch).toLowerCase(), Collectors.counting()));
        System.out.println("map2 : "+map2);
    }
}
