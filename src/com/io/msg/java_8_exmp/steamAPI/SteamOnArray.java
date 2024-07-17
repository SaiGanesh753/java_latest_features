package java_8_exmp.steamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SteamOnArray {
    public static void main(String[] args) {
        Integer[] intArr = {2, 3, 1, 4, 5};
        List<Integer> val = Arrays.stream(intArr)
                //.sorted()
                //.filter(i -> Arrays.binarySearch(intArr, i) > 2)
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println("Try programiz.pro" + val);
    }
}
