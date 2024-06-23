package java_8_exmp.foreachExample;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //External loop => for loop (before java - 1.8)
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }

        System.out.println();
        //External loop => enhanced for loop (before java - 1.8)
        for (Integer val : list) {
            System.out.print(val);
        }

        System.out.println();
        //Internal loop => foreach loop (from java - 1.8)
        list.forEach(val -> System.out.print(val)); // list.foreach(System.out::println);

    }
}
