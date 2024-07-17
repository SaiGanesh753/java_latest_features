package java_8_exmp.steamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class SequenceOrderValues {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 3, 3, 2, 2, 2, 2, 2, 5, 5, 1, 6, 6, 6, 6);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        list.stream().forEach(ele -> {
            if (map.containsKey(ele)) {
                map.put(ele, map.get(ele) + 1);
            } else {
                map.put(ele, 1);
            }
        });
        Map<Integer, Integer> map1 = map.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("map : " + map1);
        List<Integer> listEle = new ArrayList<>(0);
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                listEle.add(entry.getKey());
            }
        }
        System.out.println("listEle : " + listEle);
    }
}
