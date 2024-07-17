package java_8_exmp.steamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,45,3,2,5,3);
        Set<Integer> uniqueList = new HashSet<>();
        list = list.stream().filter(ele -> !uniqueList.add(ele)).distinct().collect(Collectors.toList());
        System.out.println("list : "+list);
    }
}
